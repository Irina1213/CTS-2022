package singleton;

public class Database {
	
	private String connectionString = "www.mydb.ro";
	
	private Database() {
			connect();
	}
	
	private void connect() {
		//connect to the db
		
	}
	
	//SINGLETON- lazy init
	//-not thread safe
	public static Database INSTANCE = null;
	
	public static Database getInstance() {
	   if(INSTANCE ==null) {
		   INSTANCE = new Database();
		
	   }
	   return INSTANCE;
	}

}
