package Function;

public class People {
	//static都不需要物件,也無法用物件的屬性
	//定義常數表示過重
	static double overWeightBMI = 24.0;
	
	public static double BMI(double h,double w) {
		return w / ( h * h );
	}
// 下方都是物件屬性跟方法,都需要new才能使用	
	double height;
	double weight;
	public double getBMI() {  //物件方法是可以呼叫Static靜態方法
//		double BMI = weight/(height * height);
		double BMI = People.BMI(height, weight);
		return BMI;
	}
	
}

