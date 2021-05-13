package PracticeExtend;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class Product {
	
	public String name;
	public int price; 
	
	public Product(String name,int price) {
		this.name = name;
		this.price = price;
	}
	public Product() {
		
	} 
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	
	public int getprice() {
		return price;
	}
	public void setprice() {
		this.price =price;
	}
	 public  String desc() {   //+final 的方法不能夠改寫的
		return String.format("名稱：%s,價錢:%d", name,price);
	}
	
}
