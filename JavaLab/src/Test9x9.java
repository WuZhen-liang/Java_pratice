
public class Test9x9 {

	public static void main(String[] args) {
		String k ="";
		for(int i = 1;i<10;i++) {
			k ="";
			for(int j = 1;j<10;j++) {
			k += (i+"x"+j+"="+(i*j)+"\t");
			}
			System.out.print(k);
			System.out.println();
		}

	}

}
