
public class TestEmployee {

	public static void main(String[] args) {
//------------實體變數--------------------------
		int a = 1 ;
		Employee emp = new Employee();//產生物件->在記憶體產生空間
		emp.empno = 1;
		emp.name = "Steve";
		Employee emp2 = new Employee();
		emp2.empno = 2;
		emp2.name = "Marry";
		//取值跟設值都適用
		System.out.println(emp.empno + ",name="+emp.name);
		System.out.println(emp2.empno + ",name="+emp2.name);
		System.out.println(emp == emp2);//0800 == 0900 記憶體位置是否一樣
		emp2 =emp;
		System.out.println(emp == emp2);//0800 == 0800 ,True
	
//		emp = null;
//		emp2 = null;
		System.out.println(emp.empno + ",name="+emp.name);//記憶體空間被清空就無法再使用
		System.out.println("Finish");
	}

}