import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class TestFor {

	public static void main(String[] args) {
/*----------------迴圈(for,while,do while)------------------------
		for(初值設定;判斷條件;次數控制){			%當超出判斷條件後跳出迴圈
			重複執行的乘式
		}		
*/			 
			for(int i = 1;i <= 100 ;i++) {
				System.out.println("i="+i);
//				i++;
			}
//			System.out.println("Finally i="+i); %Finally i =101
//----------------1-100總和(for,while,do while)------------------------
			int sum =0;
			for(int i = 1;i <= 100 ;i++) {
				sum += i;
				/*i=1,sum = 0 + 1 = 1
				  i=2,sum = 1 + 2 = 3
				  i=3,sum = 3 + 3 = 6				 
				*/
			}
			System.out.println("sum="+sum);
//----------------1-100奇數總和------------------------
			int sumData =0;
			for(int i = 1;i <= 100 ;i += 2) {
				sumData += i;
				/*i=1,sum = 0 + 1 = 1
				  i=3,sum = 1 + 3 = 4
				  i=5,sum = 4 + 5 = 9				 
				*/
				// sum = (i%2 == 1)? sum +1 : sum;
			}
			System.out.println("sumData="+sumData);
//----------------break(直接跳出迴圈)、continue(跳過下方程式，繼續迴圈的下一次執行)------------------------			
			int total = 0;
			for(int i = 0; i<=100;i++) {
				if(i % 2 ==0) {   //如果為偶數則跳過
					continue;
				}
				if (i>=50) break;
				System.out.println("i="+i);
				total +=i;
			}
			System.out.println("total="+total);
//----------------while 迴圈------------------------			
/*			while(判斷條件){   ％只要判斷條件成立就會執行
 				重複執行的程式
			}
*/
			int key = 1;
			int sumWhile = 0;
			while(key<=10){
				System.out.println("sumWhile="+(sumWhile+=key));
				key++;
			}
//---------------- do while 迴圈------------------------			
/*			do {
 				執行的程式
			}while(判斷條件)			 
*/
			int j =1;
			int sumOfDoWhile = 0;
		    do {
		    	sumOfDoWhile = sumOfDoWhile +j; 
		    	j++;
		    }while(j<=100);
		    
		    System.out.println("---------------Do While--------------");
		    System.out.println("Do While 總和="+sumOfDoWhile);
			System.out.println("j="+j);
//----------------九九乘法表（雙層迴圈)------------------------
			String k ="";
			for(int i = 1;i<10;i++) {
				k ="";
				for(int ｌ = 1;ｌ<10;ｌ++) {
				k += (i+"*"+ｌ+"="+(i*ｌ)+"\r\n");
				}
				System.out.println(k);
			}
	
	
	
	
	}

}
