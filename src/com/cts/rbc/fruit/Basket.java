package com.cts.rbc.fruit;

/**
 * @author 301732
 *	Basket Interface with common behaviors
 * More behaviors will be added if required which will be implemented later
 */
public interface Basket {
	public void addItemsToBasket(Fruit fruit);
	public void removeItemsFromBasket(Fruit fruit);
	public double calculateTotal();
	public void displayBasket();
}
