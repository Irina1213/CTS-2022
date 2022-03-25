package solidv2;

public class ProgMain {

	public static void main(String[] args) {
	
		Calculator c= new Calculator();
		IOperationType add = new AddOperation();
		c.calculate(10, 2, add);
	}

}


//Design Patterns
//-creational: Singleton
//-structure: Adapter
//-behavioural: Observer