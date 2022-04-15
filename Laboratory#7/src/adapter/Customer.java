package adapter;

import java.util.Arrays;

public class Customer {
	
	private String name;
	private int noOrders;
	private int[] ordersAmount;
	
	
	public Customer(String name, int noOrders, int[] ordersAmount) {
		super();
		this.name = name;
		this.noOrders = noOrders;
		this.ordersAmount = ordersAmount;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getNoOrders() {
		return noOrders;
	}
	private void setNoOrders(int noOrders) {
		this.noOrders = noOrders;
	}
	public int[] getOrdersAmount() {
		return ordersAmount;
	}
	private void setOrdersAmount(int[] ordersAmount) {
		this.ordersAmount = ordersAmount;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", noOrders=" + noOrders + ", ordersAmount=" + Arrays.toString(ordersAmount)
				+ "]";
	}
	
	

}
