package exception;

public class LabException4 {

	public static void main(String[] args) {
		
		int j = 1;
		try {
//			int a = (j = 2)/hello(); //hello()時發生錯誤故/(j=2)不執行
			int a = hello()/(j = 2);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(j);
		}
	}
	public static int hello() throws Exception{
		throw new Exception("exception");
	}

}
