package com.cts.rbc.grocery;

import com.cts.rbc.enums.FruitNames;
import com.cts.rbc.fruit.Fruit;
import com.cts.rbc.fruit.FruitBasket;

/**
 * @author 301732
 * This is the main class from where the execution begins
 *
 */
public class Grocery {
	public static void main(String[] args) {
		//Creating different fruit object which we need to put in basket
		Fruit banana=new Fruit(FruitNames.BANANA.name(), 5);
		Fruit orange=new Fruit(FruitNames.ORANGE.name(), 2);
		Fruit peach=new Fruit(FruitNames.PEACH.name(), 1);
		Fruit apple=new Fruit(FruitNames.APPLE.name(), 1);
		Fruit apple2=new Fruit(FruitNames.APPLE.name(), 1);
		//adding fruits into the Basket
		FruitBasket basket=new FruitBasket();
		basket.addItemsToBasket(banana);
		basket.addItemsToBasket(orange);
		basket.addItemsToBasket(peach);
		basket.addItemsToBasket(apple);
		basket.addItemsToBasket(apple2);
		
		//displaying total price of the items present in Basket
		System.out.println("Total amount for the items present in basket is:"+basket.calculateTotal());
		
		//dispaying the Basket Items
		basket.displayBasket();
	}
}
