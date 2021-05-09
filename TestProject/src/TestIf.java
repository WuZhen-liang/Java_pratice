
public class TestIf {

	public static void main(String[] args) {
		int age = 12;
		if (age >50) {
			System.out.println("年齡超過上限");
		}
		else if (age <= 12) {
			System.out.println("Not Yet 12 years old");
		}
		else {
			System.out.println("未成年");
		}
//------------巢狀If------------------
		int years = 50;
		boolean man = false;
		if (years >20 && years <80) {
			if(man == true) {
				System.out.println("成年男生");
			}
			else {
				System.out.println("成年女生");
			}
		}
		else {
			System.out.println("您不符合會員資格");
		}
	}

}
