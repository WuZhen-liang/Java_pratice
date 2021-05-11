package extend;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class Notebook extends Product {

	public int warranty;
	
	public Notebook(String name,int price,int warranty ) {
		
		setName(name);
		setPrice(price);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	@Override
	public String desc() {
		System.out.println("");
		return "123 ";
	}
}

