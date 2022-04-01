package BuilderResolved;

public class ProgMain {

	public static void main(String[] args) {
		
		//User u1 = new User("Madalina@csie.ase.ro", "Madalina@csie.ase.ro", "Madalina", "Pana", "Bucharest");
		
	   //User u2 = new User ("Madalina@csie.ase.ro", "Madalina@csie.ase.ro", "Madalina", "Pana", "0745678973");
		
		User u =  new User.UserBuilder("Madalina@csie.ase.ro", "Madalina@csie.ase.ro", "Madalina", "Pana")
				.address("Bucharest").build();
		
		User u2 = new User.UserBuilder("Madalina@csie.ase.ro", "Madalina@csie.ase.ro", "Madalina", "Pana")
				.phoneNo("0745678973").build();

	}

}
