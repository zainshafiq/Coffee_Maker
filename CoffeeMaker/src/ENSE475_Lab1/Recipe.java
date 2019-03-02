
/*
 * Name: Muhammad Ishraf Shafiq Zainuddin
 * ID  : 200342741
 * File: Recipe.java
 * 
 * Reference Author:
 * tdouglas
 */


package ENSE475_Lab1;

public class Recipe {
	
	//Declaring data members
	private String recipeName;
	private int coffeeLevel;
	private int milkLevel;
	private int sugarLevel;
	
	
	public Recipe(String recipeName, int milkLevel, int sugarLevel, int coffeeLevel) {
		this.recipeName = recipeName;
		this.coffeeLevel = coffeeLevel;
		this.milkLevel = milkLevel;
		this.sugarLevel = sugarLevel;
	}
	
	public String getRecipeName() {
		return recipeName;
	}
	
	public int getCoffeeLevel() {
		return coffeeLevel;
	}
	
	public int getMilkLevel() {
		return milkLevel;
	}
	
	public int getSugarLevel() {
		return sugarLevel;
	}
	
	
	
}