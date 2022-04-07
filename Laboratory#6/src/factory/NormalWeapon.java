package factory;

public class NormalWeapon implements IWeapon {

	@Override
	public void power() {
		System.out.println("This weapon has normal powers");
	}

}
