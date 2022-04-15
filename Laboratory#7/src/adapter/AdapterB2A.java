package adapter;

public class AdapterB2A extends DiscountA implements IDiscountB {

	@Override
	public double calculateDiscountB(Customer c) {
		
		//calcute the total of order
		return this.calculateDiscountA(c.getNoOrders());
		
		
	}
	
	
	
	

	
}
