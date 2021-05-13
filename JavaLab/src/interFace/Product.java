package interFace;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Product { 
	//有抽象方法必為抽象類別
	//抽象類別不一定會有抽象方法
//	public abstract void calc();
//	public String name;
	public static final double TAX ; //系統常數建議都用大寫
	static {
		TAX = 0.05;
//		System.out.println("static black");
	}
//public:所有人,private:自己,protected:同個package&子類別 no modifier:必須為同一個package
	public String name;
	 public int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;	
	}

	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	 public  String desc() {   //+final 的方法不能夠改寫的
		return String.format("名稱：%s,價錢:%d", name,price);
	}
	
	public static Date getDate(int year,int month,int dayOfMonth) {
		
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, dayOfMonth);
		Date date = calendar.getTime();
		return date;
	}
}
