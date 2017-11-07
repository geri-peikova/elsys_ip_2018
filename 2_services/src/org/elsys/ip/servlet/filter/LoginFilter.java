package org.elsys.ip.servlet.filter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.elsys.ip.servlet.model.User;
import org.elsys.ip.servlet.service.UserService;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {
	/**
	 * Default constructor.
	 */
	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		String username = null;
		String password;
		boolean authorized = false;
		UserService service;
		User user = null;
		RequestDispatcher dispatcher;
				
		Cookie cookies[] = ((HttpServletRequest) request).getCookies();
		
		if (cookies != null) {
			for(Cookie ck : cookies){
					if (ck.getName().equals(username)) {
						authorized = true;
						request.setAttribute("name", ck);
					}	
			}
		}
				
		

		if (!authorized) {
			username = request.getParameter("name");
			password = request.getParameter("password");
	         
			service = UserService.getInstance();
			user = service.getByName(username);
			
			if (user != null) {
				authorized = true;
	            Cookie ck=new Cookie("name",username);  
	            ((HttpServletResponse) response).addCookie(ck);
			}
		}
		
		// check username and password (can be hardcoded, can use the userService)
		// add if the person is logged in to a cookie (Google it), so that we do not check at every page
		if (authorized) {
			chain.doFilter(request, response);
		} else {
			request.setAttribute("error", "Wrong username or password!");
			dispatcher = request.getRequestDispatcher("log_user.jsp");
			dispatcher.forward(request, response);		
		}	 
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
