package abstractFactory;

public class ProgMain {

	public static void main(String[] args) {
		
		//SIMPLE FACTORY
//		Factory factory = new Factory();
//		
//		IWeapon weapon = factory.getWeapon(300);
//		weapon.power();
		
		
		
		//FACTORY METHOD
		//IFactory factory = new CheapFactory();
		//IWeapon weapon = factory.getWeapon();
		//weapon.power();
		
		//ABSTRACT FACTORY
		//abstract factory-families of objects
		
		Shop shop = new Shop(new MagicFactory());
		shop.createFamilyObjs();

	}

}
