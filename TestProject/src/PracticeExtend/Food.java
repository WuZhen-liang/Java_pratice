package PracticeExtend;

import java.util.Date;

public class Food extends Product{
	
	private Date expireDate;
	
	public Food (String name,int price,Date expireDate ) {
		
		this.name = name;
		this.price = price;
		this.expireDate = expireDate;	
	}
	   @Override
	    public String desc() {
	        String description = super.desc();
	        description = description +",到期日："+expireDate;
	        return description;
	    }
	
	
}
