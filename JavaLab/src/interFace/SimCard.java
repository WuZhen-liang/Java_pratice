package interFace;

import java.util.Date;

public class SimCard extends Product {
	
	private Date expireDate;
	
	public SimCard(String name, int price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }
    @Override
    public String desc() {
        String description = super.desc();
        description = description +",到期日："+expireDate+",開卡後可用七天";
        return description;
    }
	
}
