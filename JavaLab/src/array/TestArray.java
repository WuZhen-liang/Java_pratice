package array;

public class TestArray {

	public static void main(String[] args) {
//		 int ,double,float char boolean
		int[] age = new int[10]; //預設值為:0
		
		age[0] = 1; //第一格起始位置是0
		age[1] = 2;
		age[2] = 3;
		
		System.out.println("length="+age.length);//取陣列的長度[array.length]
//------------取得陣列的索引值------------------		
		
		System.out.println(age[1]); //Array[索引值]
		System.out.println(age[9]);//ArrayIndexOutOfBoundsException 超出索引範圍
		System.out.println("finish");
	
		int[] ages = {1,2,3}; //快送產生陣列的方式:大括號產生{} 
	
		System.out.println(ages[1]); //Array[索引值]
// -------------進階for迴圈--------------
/*		for(宣告 : 陣列){
      }		
*/		
		for(int a : ages) {
			System.out.println(a);
		}

		
	
	
	}

}
