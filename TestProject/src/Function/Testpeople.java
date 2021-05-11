package Function;

public class Testpeople {

	public static void main(String[] args) {
		
		People p = new People();
		
		p.height = 1.7;
		p.weight = 50;
		
		System.out.printf("BMI=%.2f",p.getBMI());
		System.out.println("\r\n"+People.overWeightBMI);

		
		double bmi = People.BMI(1.7, 50);
		System.out.println("BMI="+bmi);
	}

}
