package equals;

public class Employee {

	private String id;
	
	public Employee(String id) {
		if (id == null) {
			throw new IllegalArgumentException("ID 不得為空值");
		}
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Employee) {
			Employee emp  = (Employee) obj;
			//下方的equals是借用String文字的逐字比較
			//String有改寫override繼承來的equals方法
			return this.id.equals(emp.id);		
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		//回傳代表物件的數字,通常會跟你equals中比較屬性有關
		//藉用String hashcode滿足java的規範
		return id.hashCode(); 
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("id="+id+",被GC");
	}
	
	@Override
	public String toString() {
		
		return String.format("Employee(%s)", id);
	}
	
}


