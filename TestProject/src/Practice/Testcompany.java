package Practice;

public class Testcompany {

	public static void main(String[] args) {
		company cp = new company();
		
		cp.empno = 1;
		cp.ename = "Steve";
		cp.detm = "IT";
		System.out.printf("員工編號:%d,員工名字:%s,員工部門:%s",cp.empno,cp.ename,cp.detm);
	}

}
