package org.elsys.ip.servlet.model;


public class Clothes {
	private static int counter = 0;
	public enum Type{
		JACKETS,
		DRESSES,
		SKIRTS,
		BOTTOMS,
		SWEATERS,
		TOPS,
		INTIMATES,
		PIJAMAS,
		SWIM,
		SHOES,
		ACCESSORIES
	}
	public enum Size{
		XS,
		S,
		M,
		L,
		XL,
		XXL
	}
	public enum Color{
		WHITE,
		GRAY,
		BLACK,
		SILVER,
		GOLD,
		RED,
		PINK,
		ORANGE,
		YELLOW,
		GREEN,
		BLUE,
		PURPLE,
		BROWN
	}
	public enum Category{
		WOMEN,
		MAN,
		KIDS
	}
	
	private Type type;
	private Size size;
	private Color color;
	private Category category;
	private String designer;
	private String brand;
	private String fabric;
	private double price;	
	private String collection;
	private String store;
	private int id;
	
	public Clothes(Type type, Size size, Color color, Category category, String designer, String brand, String fabric, double price, String collection, String store){
		this.type = type;
		this.size = size;
		this.color = color;
		this.category = category;
		this.designer = designer;
		this.brand = brand;
		this.fabric = fabric;
		this.price = price;
		this.collection = collection;
		this.store = store;
		this.id = counter++;
		
	}
	
	public int getId(){
		return id;
	}
	public Type getType(){
		return type;
	}
	public void setType(Type a){
		type = a;
	}
	public Size getSize(){
		return size;
	}
	public void setSize(Size a){
		size = a;
	}
	public Color getColor(){
		return color;
	}
	public void setColor(Color a){
		color = a;
	}
	public Category getCategory(){
		return category;
	}
	public void setCategory(Category a){
		category = a;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String a) {
		designer = a;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String a) {
		brand = a;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String a) {
		fabric = a;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double a) {
		price = a;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String a) {
		collection = a;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String a) {
		store = a;
	}
	
  
}
