package PracticeExtend;

public class NoteBook extends Product{
	
	public int warranty;
	
	public NoteBook(String name, int price , int warranty ) {
		
		super(name, price);
		
		this.warranty = warranty;
	}
	public NoteBook() {
		
	}
	
	@Override
	public String desc() {
	String info = super.desc();//可以呼叫父類別上的方法  //名稱:%s,價錢:%d
//	return String.format("名稱：%s,價錢:%d,保固:%d天",name,price,warranty);
//	System.out.println(info);
	return String.format("%s,保固:%d天",info,warranty);
	}
	public int getwarranty() {
		return warranty;
	}
	public void setwarranty(int warranty) {
		this.warranty = warranty;
	}
	
}
