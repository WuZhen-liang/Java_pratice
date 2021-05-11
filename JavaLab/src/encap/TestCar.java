package encap;

public class TestCar {

	public static void main(String[] args) {
//      encapsulation封裝 		
		Car c = new Car();
//		c.model = "Prius";
		c.setModel("Prius");
//		c.price = 1000000;
		
		System.out.printf("型號:%s,價錢:%7d",c.getModel(),c.getPrice());

	}

}
