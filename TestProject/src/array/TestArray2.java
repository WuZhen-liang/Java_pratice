package array;

public class TestArray2 {

	public static void main(String[] args) {
		
		int[][] number = {{1,2},{4,5},{7,8}};
		
		System.out.println(number[1][1]);//5
		System.out.println("每排有幾個= "+number[0].length);
		System.out.println("有幾排= "+number.length);
		System.out.println("---------------");
		for (int i = 0; i < number.length ; i++) {
			for(int j = 0; j < number[i].length ; j++) {
				System.out.println(number[i][j]);
			}
		}
		System.out.println("--------------");	
		for (int [] k : number) {
			for(int l : k) {
				System.out.println(l);
			}
		}
		
	}

}
