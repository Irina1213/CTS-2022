package Singleton;

public class Databasev2 {
	
	 private static Databasev2 INSTANCE = null;
	 
	 
	 private Databasev2 () {
		 
	 }
	 
	 //everytime you have multiple threads - speed the process- better performance
	 //also lazy init but thread safe
	 //this is the best approach so far
	 
	 public static Databasev2 getInstance() {
		 if(INSTANCE == null) {
			 
			synchronized (Databasev2.class) {
				
				if(INSTANCE == null) {
					
					INSTANCE = new Databasev2();
					
				}
		
			}
		
			 
		 }
		 return INSTANCE;
	 }

}
