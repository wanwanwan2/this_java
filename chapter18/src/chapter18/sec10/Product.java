package chapter18.sec10;

import java.io.Serializable;

public class Product implements Serializable{
	private static final long serailVersionUID = -621812868470078544L;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() { return name + ": " + price; }
}
