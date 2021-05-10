
import category.Item;
//若目錄下很多class 可以用category.*

public class TestPackage {

	public static void main(String[] args) {
		//在package下的類別必須使用全名
		category.Item  item = new category.Item();
		item.name = "Asus notebook";
		System.out.println("TestPackage's main:"+item.name);
		/*		若上面宣告import category.Item 下方只需要打Item 	
		Item  item = new Item();
		item.name = "Asus notebook"; */
	}

}
