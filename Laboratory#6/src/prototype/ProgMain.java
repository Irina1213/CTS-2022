package prototype;

public class ProgMain {

	//you have prototype- you create the first object
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop carturesti = BookShop.loadDataFromDatabase("carturesti") ; //new
		System.out.println(carturesti);
		
		//System.out.println("SHALLOW COPY");
		//BookShop diverta = carturesti;
		
		System.out.println("DEEP COPY");
		BookShop diverta = (BookShop) carturesti.clone();
		diverta.getBooks().remove(3);
		System.out.println(carturesti);
	
	}
}
