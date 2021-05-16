package interFace;

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
   
		Product item = nb; //Notebook -> Product 子類別轉父類別
		System.out.println(item instanceof NoteBook);//true
		if (item instanceof NoteBook) {
			NoteBook nb1 = (NoteBook)item;//Product ->Notebook (?) 父類別轉型成子類別			
			System.out.println("保固:"+nb1.getWarranty());
		}
		//Food f1 = (Food)item;//Product ->Food (?) 父類別轉型成子類別
		//		nb.getWarranty() ;
		// 先取得日曆Calender在取得日期Date,月份0起算
//		GregorianCalendar calendar = new GregorianCalendar(2021, 4, 13);
//		GregorianCalendar calendar = new GregorianCalendar(2021, Calendar.MAY, 13);
		
		Date date = Product.getDate(2021, 5, 14);
		
		Food food = new Food("肉鬆",200, date);
		System.out.println(food.desc());
		
		SimCard sim = new SimCard("日本游漫遊", 600, Product.getDate(2021, 4, 30));
		
//		Product[] items = new Product[] {nb,food};
		Product[] items = {nb,food,sim};
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
		for(Product eachItem :ps) { //nb,food,simcard
			System.out.println("買入:"+eachItem.desc());
			if (eachItem instanceof Expirable ) {
				Expirable exp = (Expirable)eachItem;
				Date now = new Date();//取得電腦現在時間
				if (exp.最後期限().before(now)) {
					System.out.println("已過期");
					continue;
				}
			}
			sum = sum +eachItem.getPrice();		
		}
		System.out.println("總金額:"+sum);
	}

}
