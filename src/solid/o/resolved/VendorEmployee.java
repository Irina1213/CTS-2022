package solid.o.resolved;

//you can extend only one class
//can implement as many interfaces as you want

public class VendorEmployee extends Employee {
	
	private float salary;

	public VendorEmployee(int iD, String name, float salary) {
		super(iD, name);
		this.salary=salary;
	
	}

	@Override
	public float calculateBonus() {
		
		return this.salary*.05f;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "VendorEmployee" +super.toString()+" [salary=" + salary + "]";
	}
	
	
         
}


