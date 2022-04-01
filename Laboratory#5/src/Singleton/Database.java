package Singleton;

public class Database {
	
	//early init - we create the object even if we don t need it
	//thread safe
	//not ok-using memory even if we don t need it
	
	private static  Database INSTANCE = null;
	static {
		try {
		INSTANCE = new Database(-1);
	} catch (Exception e) {
		

		e.printStackTrace();
	}
	}
	private Database(int something) throws Exception {
		if(something < 0) {
			throw new Exception();
		}
		
	}
	
	public static Database getInstance() {
		return INSTANCE;
	}

}
