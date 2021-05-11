package encap;

public class Car {

	public  Car(char c) {
		this.color = c;
	}
	public  Car(String model, char color) {
		setmodel(model);
		this.color = color;
	}
	
	
	
	private String model ;
	private int price;
	private char color;
	
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model = model;
		if (model.equals("Cliff")) {
			this.price = 576000;
		}
		else if(model.equals("Steve")) {
			this.price = 1501321;
		}
		else {
			System.out.println("you keyin the  wrong Model's name ");
		}
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public char getcolor() {
		return color;
	}
	public void setColor() {
		this.color = color;
	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
}
