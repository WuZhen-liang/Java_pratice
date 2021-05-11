package extend;

public class TestProduct {

	public static void main(String[] args) {
		
		Notebook nb = new Notebook("asus",5000,365);
		System.out.printf("%s,%d,%d%n",nb.getName(),nb.getPrice(),nb.getWarranty());
		System.out.println(nb.desc());
	}

}
