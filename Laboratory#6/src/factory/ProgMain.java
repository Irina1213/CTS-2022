package factory;

public class ProgMain {
	
	//Factory-creation DP-creates the object for some rules-hides exactly what are you creating
	//Factory-simple 
	        //-abstract 
	        //-method

	public static void main(String[] args) {
		
		IWeapon weapon; //hide this: new MagicWeapon();
		
		try {
			
			weapon = WeaponFactory.createWeapon(200);
			weapon.power();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}
