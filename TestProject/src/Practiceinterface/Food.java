package Practiceinterface;
// java.sql.Date:JDBC
import java.util.Date;

public class Food extends Product implements Expirable{

	@Override
	public Date dayline() {
		return expireDate;
	}

    private Date expireDate;

    public Food(String name, int price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public String desc() {
        String description = super.desc();
        description = description +",到期日："+expireDate;
        return description;
    }

}
