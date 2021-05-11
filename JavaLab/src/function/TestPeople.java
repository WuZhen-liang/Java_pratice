package function;

public class TestPeople {

	public static void main(String[] args) {

		People p = new People();
		p.height = 1.7;
		p.weight = 70;
		System.out.printf("BMI=%.2f\r\n",p.getBMI());
		System.out.println("BMI="+p.getBMI());
		System.out.println("過重BMI="+p.overWeightBMI);
		if (p.getBMI()>p.overWeightBMI) {
			System.out.println("BMI 超標");
		}
		
		double bmi = People.BMI(1.7, 70);
		System.out.println("Static method BMI= "+bmi);
		System.out.println(Math.pow(2, 5));
	}

}
