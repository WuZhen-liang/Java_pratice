package equals;

public class TestEquals {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("001");
		Employee e2 = new Employee("001");
		
		System.out.println(e1 == e2);//compare memory location //false
		System.out.println(e1.equals(e2));//compare memory location //false
		
		e1 = null;
		System.gc();//強制系統執行GC
		
		System.out.println(e2);
		System.out.println(e2.toString());
		
	}

}
