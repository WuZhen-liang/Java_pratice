package PracticeConstructor;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.ExistingAnnotationsType;

public class Car {

	private String model;
	private int price;
	private char color;
	
	public Car (char c) {
		this("aaa", 645200, 'R');
		
	}
	public Car (String model,int price,char color) {
		this.price = price;
		this.color = color;
		setModel(model);
	}
	public String getModel () {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
		if (model.equals("aaa")) {
			this.price = 57500;
		}
		else {

			System.out.println("輸入錯誤");
		}
	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
	public char getColor() {
		return color;
	}
	public void setColor() {
		this.color = color;
	}
	
	
	
	
	
}

