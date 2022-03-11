package solid.o.resolved;

public class ProgMainOResolved {

	public static void main(String[] args) {
		Employee empMada = new FTEmployee(1, "Mada", 2000); //an employee acting like an FTEmployee
		System.out.println(empMada.toString() + "BONUS: "+empMada.calculateBonus());
		

	}

}
