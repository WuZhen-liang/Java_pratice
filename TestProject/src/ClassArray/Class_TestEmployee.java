package ClassArray;

public class Class_TestEmployee {
	

	public static void main(String[] args) {
		Class_Employee[] emps = new Class_Employee[2];
		/*
		Employee emp1 = new Employee(); 
		emp1.name = "Cliff";
		emp1.empno = 1 ;
		emps[0] = emp1 ;
		*/
		emps[0] = new Class_Employee();
		emps[0].name = "Cliff";
		emps[0].empno = 1;
		
		/*
		Employee emp2 = new Employee();
		emp2.name = "Steve";
		emp2.empno = 2 ;
		emps[1] = emp2 ;
		*/
		
		emps[1] = new Class_Employee();
		emps[1].name = "Steve";
		emps[1].empno = 2;
//							 0,1
		for (int i =0 ; i < emps.length ; i++) {
		
			System.out.println(emps[i].name);
		}
	}
												
}
