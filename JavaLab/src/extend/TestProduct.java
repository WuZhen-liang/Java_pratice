package extend;

public class TestProduct {

	public static void main(String[] args) {
		
		NoteBook nb = new NoteBook("Kevin","Asus",30000,365);
		System.out.printf("%s,%s,%d,%d%n",nb.getStore(),nb.getName(),nb.getPrice(),nb.getWarranty());
	
		
		System.out.println(nb.desc());
		
		Product a = new Product("冷氣",5000,"Kevin");
		System.out.println(a.name+a.price+a.store);
	
		
	}

}
