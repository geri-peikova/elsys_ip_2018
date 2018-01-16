package org.elsys.ip.servlet.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import org.elsys.ip.servlet.model.Clothes;
import org.elsys.ip.servlet.model.Clothes.Category;
import org.elsys.ip.servlet.model.Clothes.Color;
import org.elsys.ip.servlet.model.Clothes.Size;
import org.elsys.ip.servlet.model.Clothes.Type;

public class UserService {
	private static Hashtable<Integer,Clothes> clothes = new Hashtable<Integer,Clothes>();

	public UserService() {
		Clothes c = new Clothes(Type.DRESSES, Size.S, Color.PINK, Category.WOMEN, "Gergana Peikova", "Dior", "tulle", 1700, "Prom", "Peek&Cloppenburg");
		clothes.put(c.getId(), c);
		c = new Clothes(Type.TOPS, Size.XS, Color.YELLOW, Category.KIDS, "Maria Stefanova", "Beneton", "silk", 19.90, "Spring", "TheMall");
		clothes.put(c.getId(), c);
		c = new Clothes(Type.JACKETS, Size.XL, Color.BLACK, Category.MAN, "Joseph King", "H&M", "leather", 29.90, "Hoodie", "ParadiseCenter");
		clothes.put(c.getId(), c);
	}

	public static void remove(int id) {
		clothes.remove(id);
	}
	
	public static void add(Clothes c) {
		clothes.put(c.getId(), c);
	}
	
	public static Collection<Clothes> getClothes() {
		return clothes.values();
	}

	public static Clothes getByBrand(String name) {
		System.out.println(name);
		if (name != null) {
			return clothes.values().stream().filter(u -> name.equals(u.getBrand())).findFirst().orElse(null);
		} else {
			return null;
		}
	}
}
