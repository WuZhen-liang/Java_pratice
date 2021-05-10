package array;

public class TestArray2 {

	public static void main(String[] args) {
//-------------------多為陣列(int[column][row])---------------------		
//		int [][] x = new int[5][4];
		int [][] x = { {1,2,3},{4,5},{7,8,9}};
		
//		x[0][1] = 20;
//		x[1][1] = 40;
		
		System.out.println(x[1][1]);
		System.out.println("有幾排="+x.length);//有幾排
	    System.out.println("第一排有幾個="+x[0].length);
		
	    for (int i = 0;i<x.length;i++) {           //有幾排
	    	for(int j = 0;j<x[i].length ; j++) {   //第幾排有幾個
	    		System.out.println(x[i][j]);       //i代表第幾排,j代表第幾個
	    	}
	    }

	    System.out.println("========================");
// -------------進階for迴圈--------------
/*		for(宣告 : 陣列){
	    	執行內容
	    	}		
*/		    
	    for (int[] a : x ) {
	    	for(int k :  a) {
	    		System.out.println(k);
	    	}
	    }
		
	}

}
