package interFace;

public class  Superman implements Lawyer,Accountant{
	// 三個型態 
	@Override
	public void 訴訟() {
				
	}
	@Override
	public void 報稅() {
		
		
	}
	public static void main(String[] args) {
		
		Superman s = new Superman();
		
		s.訴訟();
 		s.報稅();

	}

}
