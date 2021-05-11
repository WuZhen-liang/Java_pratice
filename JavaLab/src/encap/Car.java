package encap;

import java.awt.Color;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class Car {
//下方程式為建構方法:Constructor
	public Car(char c) {  //初始化預設內容
		color = c;
	}
	public Car(String model,char color) {  //初始化預設內容
//		this.model = model;
		setModel(model);
		this.color = color;
		}
//========================================	
	private String model;  //預設值:null
	private int price;     //預設值: 0
	private char color;    //預設值:''
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
		if (model.equals("Yaris")) {
			this.price = 575000;
		}
		else if (model.equals("Prius")){
			this.price = 109000;
		}
		else {
			System.out.println("Error:型號錯誤");
		}
	}
	public int getPrice() {
		return price; //lambda Car.this.price
	}
	public char getColar() {
		return color;
	}
	public void setColar(char colar) {
		this.color = colar;
	}
	
}
