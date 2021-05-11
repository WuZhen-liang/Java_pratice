package extend;
//extend class :Product 為父類別,NoteBook 為子類別
public class NoteBook extends Product{
	
//	public String name;	//從Product繼承過來的
//	public int price;
	public int warranty;
	
	public NoteBook(String name, int price, int warranty) {
//		this.name = name;  //若父類別屬性改成private無法使用this
//		this.price = price; //宣告　protected：子列別＆同個package 可以看到屬性
		setName(name);
		setPrice(price);
		this.warranty = warranty;
	}
//-----------Override:重新改寫父類別的方法-----------------	
	//annotation
	@Override
		public String desc() {
		return String.format("名稱：%s,價錢:%d,保固:%d天",name,price,warranty);
		}
	
	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	
	
	
	
	
	
	
}
