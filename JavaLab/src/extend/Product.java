package extend;

public class Product {
//public:所有人,private:自己,protected:同個package&子類別 no modifier:必須為同一個package
//	public String name;
	protected String name;
	protected int price;
	public String store;
	
	public Product(String name, int price, String store) {
		this.name = name;
		this.price = price;
		this.store = store;
		
	}

	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String desc() {
		return String.format("名稱：%s,價錢:%d", name,price);
	}
	public void setStore(String store) {
		this.store = store;
		
	}
	public String getStore() {
		return store;
	}
	
	
}
