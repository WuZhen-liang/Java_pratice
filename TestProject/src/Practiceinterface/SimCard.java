package Practiceinterface;

import java.util.Date;

public class SimCard extends Product implements warrantable,Expirable {

	private Date expireDate;
	@Override
	public Date dayline() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int day() {
		// TODO Auto-generated method stub
		return 0;
	}
	public SimCard(String name,int price,Date expireDate) {
		
		super(name, price);
		this.expireDate =expireDate;
		
	}
	
	   @Override
	    public String desc() {
	        String description = super.desc();
	        description = description +",到期日："+expireDate+",開卡後可用七天";
	        return description;
	    }
	
}
