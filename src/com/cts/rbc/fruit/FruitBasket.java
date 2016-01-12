package com.cts.rbc.fruit;

import java.util.HashMap;
import java.util.Map;

import com.cts.rbc.enums.FruitNames;

/**
 * @author 301732
 * Concrete class which implements Basket interface
 * This class is responsible for having implementation of displaying basket items,
 * calculating total price of the items present in the basket.
 */
public class FruitBasket implements Basket{

	/**
	 * Collection holding basket items i.e. Fruits currently
	 * in future we can change this to hold all grocery items.
	 */
	private Map <String,Fruit> fruitBasket;

	/**
	 * @return the fruitBasket
	 */
	public Map<String, Fruit> getFruitBasket() {
		return fruitBasket;
	}

	/**
	 * @param fruitBasket the fruitBasket to set
	 */
	public void setFruitBasket(Map<String, Fruit> fruitBasket) {
		this.fruitBasket = fruitBasket;
	}

	/* (non-Javadoc)
	 * @see com.cts.rbc.fruit.Basket#addItemsToBasket(com.cts.rbc.fruit.Fruit)
	 * This method is responsible for adding different fruit items to the basket
	 * if one fruit is added more than once then only quantity will be increased.
	 */
	@Override
	public void addItemsToBasket(Fruit fruit) {
		float quantity=0;
		//initializing collection
		if(fruitBasket==null){
			fruitBasket=new HashMap<String, Fruit>();
		}
		//add item to basket if not present
		if(!fruitBasket.containsKey(fruit.getFruitName())){
			fruitBasket.put(fruit.getFruitName(), fruit);
		}else{
			//increase quantity if one fruit is added more than one time in the basket 
			quantity=fruitBasket.get(fruit.getFruitName()).getQuantity();
			fruit.setQuantity(quantity+fruit.getQuantity());
			fruitBasket.put(fruit.getFruitName(), fruit);
		}
	}

	/* (non-Javadoc)
	 * @see com.cts.rbc.fruit.Basket#removeItemsFromBasket(com.cts.rbc.fruit.Fruit)
	 * This method will remove the respective fruit item from the basket.
	 */
	@Override
	public void removeItemsFromBasket(Fruit fruit) {
		if(fruitBasket!=null){
			fruitBasket.remove(fruit.getFruitName());
		}
	}

	/* (non-Javadoc)
	 * @see com.cts.rbc.fruit.Basket#calculateTotal()
	 * This method will calculate the total price of the items present in the basket 
	 */
	@Override
	public double calculateTotal() {
		//setting temporary prices for fruits per kg/ per piece 
		//need to update it once we decide whether to take input from user or keep it constant
		double applePrice=50.00;
		double bananaPrice=5.80;
		double orangePrice=30.00;
		double lemonPrice=3.50;
		double peachPrice=70.00;
		double totalPrice=0.0;
		//calculating total price 
		if(fruitBasket!=null){
			for(String key:fruitBasket.keySet()){
				if(key.equalsIgnoreCase(FruitNames.APPLE.name())){
					totalPrice=totalPrice+fruitBasket.get(key).getQuantity()*applePrice;
					fruitBasket.get(key).setPrice(fruitBasket.get(key).getQuantity()*applePrice);
					fruitBasket.put(key, fruitBasket.get(key));
				}if(key.equalsIgnoreCase(FruitNames.BANANA.name())){
					totalPrice=totalPrice+fruitBasket.get(key).getQuantity()*bananaPrice;
					fruitBasket.get(key).setPrice(fruitBasket.get(key).getQuantity()*bananaPrice);
					fruitBasket.put(key, fruitBasket.get(key));
				}if(key.equalsIgnoreCase(FruitNames.ORANGE.name())){
					totalPrice=totalPrice+fruitBasket.get(key).getQuantity()*orangePrice;
					fruitBasket.get(key).setPrice(fruitBasket.get(key).getQuantity()*orangePrice);
					fruitBasket.put(key, fruitBasket.get(key));
				}if(key.equalsIgnoreCase(FruitNames.LEMON.name())){
					totalPrice=totalPrice+fruitBasket.get(key).getQuantity()*lemonPrice;
					fruitBasket.get(key).setPrice(fruitBasket.get(key).getQuantity()*lemonPrice);
					fruitBasket.put(key, fruitBasket.get(key));
				}if(key.equalsIgnoreCase(FruitNames.PEACH.name())){
					totalPrice=totalPrice+fruitBasket.get(key).getQuantity()*peachPrice;
					fruitBasket.get(key).setPrice(fruitBasket.get(key).getQuantity()*peachPrice);
					fruitBasket.put(key, fruitBasket.get(key));
				}
			}
			
			
		}
		return totalPrice;
	}

	/* (non-Javadoc)
	 * @see com.cts.rbc.fruit.Basket#displayBasket()
	 * This method will display items present in the basket with name, quantity and price
	 */
	@Override
	public void displayBasket() {
		if(fruitBasket!=null){
			System.out.println("Following are the fruit Items present in the Basket :");
			System.out.println("FruitName    Quantity     Price (Rs)");
			for(String key:fruitBasket.keySet()){
				System.out.println(fruitBasket.get(key).getFruitName()+"        "+fruitBasket.get(key).getQuantity()+" kg         "+fruitBasket.get(key).getPrice() );
			}
		}
	}
	
	
}
