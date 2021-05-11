package encap;

public class TestCar {

	public static void main(String[] args) {
		Car c = new Car("Steve",'R');
		
//		c.setmodel("Cliff");
		System.out.printf("型號:%s,價錢:%d,顏色:%c",c.getmodel(),c.getPrice(),c.getcolor());
		
	}

}
