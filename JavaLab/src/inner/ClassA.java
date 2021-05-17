package inner;

public class ClassA {
	
	private double height = 0;
	private double weight = 0;
	
	public ClassA(double height , double weight) {		
		this.height = height;
		this.weight = weight;
	}
	
	public void printBMI() {
		InnerClass inner = new InnerClass();
		double bmi = inner.calcBMI(); //alt+shift+L
		System.out.println(bmi);
	}
	private class InnerClass{
		public double calcBMI() {
			return weight /(height*height);
		}
	}
	
	
}
