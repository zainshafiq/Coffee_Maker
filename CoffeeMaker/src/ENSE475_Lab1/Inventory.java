
/*
 * Name: Muhammad Ishraf Shafiq Zainuddin
 * ID  : 200342741
 * File: Inventory.java
 * 
 * Reference Author:
 * tdouglas
 */


package ENSE475_Lab1;

public class Inventory {
	
	//Initialize data members
	private int coffee;
	private int milk;
	private int sugar;
	
	//Constructor
	public Inventory() {
		coffee = 0;
		milk = 0;
		sugar = 0;
	}
	
	public int getMilk() {
		return milk;
	}
	
	public void setMilk(int milk) {
		this.milk = milk;
	}
	
	public int getCoffee() {
		return coffee;
	}
	
	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}
	
	public int getSugar() {
		return sugar;
	}
	
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	
	
}