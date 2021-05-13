package extend;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import jdk.internal.dynalink.beans.StaticClass;
import sun.util.calendar.Gregorian;

public class TestProduct {

	public static void main(String[] args) {
		
		//Notebook 具備兩個型態,一個是本身的Notebook,另一個繼承來的Product
		NoteBook nb = new NoteBook("Asus",30000,365);
		
		System.out.println(nb.desc());		
//		nb.getWarranty() ;
		// 先取得日曆Calender在取得日期Date,月份0起算
//		GregorianCalendar calendar = new GregorianCalendar(2021, 4, 13);
		GregorianCalendar calendar = new GregorianCalendar(2021, Calendar.MAY, 13);
		
		Date date = calendar.getTime();
		
		Food food = new Food("肉鬆",200, date);
		System.out.println(food.desc());
		
//		Product[] items = new Product[] {nb,food};
		Product[] items = {nb,food};
		buy(items);
	}
//	public static void buy(Food f) {
//		System.out.println("買入:"+f.desc());
//		
//	}
//	public static void buy(NoteBook n) {
//		System.out.println("買入:"+n.desc());
//		
//	}
	public static void buy(Product[] ps) {
		
		int sum = 0;
		for(Product eachItem :ps) {
			System.out.println("買入:"+eachItem.desc());
			sum = sum +eachItem.getPrice();		
		}
		System.out.println("總金額:"+sum);
	}

}
