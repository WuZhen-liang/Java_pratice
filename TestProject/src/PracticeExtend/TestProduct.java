package PracticeExtend;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import sun.security.provider.NativePRNG.NonBlocking;

public class TestProduct {

	public static void main(String[] args) {
		
		NoteBook nb = new NoteBook("asus", 50000, 20);
		
		System.out.println(nb.desc());
		
		System.out.printf("名字:%s,價格:%d,保固:%d%n",nb.getname(),nb.getprice(),nb.getwarranty());
		
		Product item = nb;
		
		System.out.println(item instanceof NoteBook);
		
		if (item instanceof NoteBook) {
			NoteBook nb1 = (NoteBook)item;
			System.out.println(nb1.getwarranty());
		}
		GregorianCalendar calendar = new GregorianCalendar(2021, Calendar.MAY, 13);
		
		Date date = calendar.getTime();
		Food food = new Food("pizza", 200, date);
		System.out.printf("食物:%s,價格:%d",food.getname(),food.getprice());
	}

}
