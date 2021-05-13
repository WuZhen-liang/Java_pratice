package interFace;

public interface Warrantable {

//	int 保固天數();
	
	public  default int 保固天數() {//static:不允許覆寫,default:可以覆寫
		return MAX_WARRANTY;
	}
	
	public static final int MAX_WARRANTY = 365;
	
	
}
