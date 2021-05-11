
public class TestIf {

	public static void main(String[] args) {
		/*--------------if else statement----------------------
					if else 敘述:
					if(判斷式1) {
						若判斷式1成立執行的內容
					else if(判斷式2){
						若判斷式2成立執行的內容
					}	
					else{
						前面判斷式都不成立執行的內容
					}
		*/
		int age = 20;
		if (age >= 30) {
			System.out.println("壯年");
		} else if (age >= 20) {
			System.out.println("成年");
		} else {
			System.out.println("未成年");
		}
		/*--------------巢狀if else敘述----------------------
				if(判斷式一) {               %判斷式一成立才會到判斷式二
					若判斷式1成立執行的內容     
					if(判斷式二){           
						若判斷式2成立執行的內容
				}	
				else{					   % 若判斷式一不成立會執行else
					前面判斷式都不成立執行的內容
				}
		*/
		int year = 25;
		if (year >= 18) {
			System.out.println("成年");
			if (year >= 30) {
				System.out.println("壯年");
			}
			else {
				System.out.println("未滿三十歲");
			}
		} 
		else {
			System.out.println("未成年");
		}
//----------------switch------------------------
		int classroom = 205;
		switch(classroom) {
		case 204:
			System.out.println("人數大於等於30人");
			break;
		case 205:
			System.out.println("人數小於等於30人大於等於20人");
			break;
		default:
			System.out.println("其他");		
		}

		
	}
}