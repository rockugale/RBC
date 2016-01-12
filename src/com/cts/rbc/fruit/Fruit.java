package com.cts.rbc.fruit;

/**
 * @author 301732
 * Entity class representing Fruit object
 * which accepts fruitname and quantity as a pramaerter while creating object of this class.
 * More attributes like origin and measuring units can be added if required
 */
public class Fruit {

	private String fruitName;
	private float quantity;
	private double price;
	public Fruit(String fruitName,float quantity){
		this.fruitName=fruitName;
		this.quantity=quantity;
	}
	
	/**
	 * @return the fruitName
	 */
	public String getFruitName() {
		return fruitName;
	}
	/**
	 * @param fruitName the fruitName to set
	 */
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	/**
	 * @return the quantity
	 */
	public float getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
}
