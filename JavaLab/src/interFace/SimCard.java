package interFace;

import java.util.Date;

public class SimCard extends Product implements Warrantable,Expirable{
//SimCard :SimCard,Product,Warrantable,Expirable 四種型態
	@Override
	public Date 最後期限() {
		return expireDate;
	}
	@Override
	public int 保固天數() {
		return 7;
	}
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
