package extend;

public class TestProduct {

	public static void main(String[] args) {
		
		NoteBook nb = new NoteBook("Asus",30000,365);
		System.out.printf("%s,%d,%d%n",nb.getName(),nb.getPrice(),nb.getWarranty());
	
		
		System.out.println(nb.desc());
		
		Product a = new Product("冷氣",5000);
		System.out.println(a.name+a.price);
	
		
	}

}