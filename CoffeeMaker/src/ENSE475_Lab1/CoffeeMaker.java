
/*
 * Name: Muhammad Ishraf Shafiq Zainuddin
 * ID  : 200342741
 * File: CoffeeMaker.java
 * 
 * Reference Author:
 * tdouglas
 */


package ENSE475_Lab1;

public class CoffeeMaker {
	
	//Initializing data members
	private int numRecipes;
	private Inventory inv;
  	private Recipe[] rList;
  	public static final int maxNumRecipe = 4;
  	public static final int maxInventory = 20;
  
  	//Constructor
  	public CoffeeMaker() {
  		inv = new Inventory();
  		inv.setMilk(maxInventory);
  		inv.setCoffee(maxInventory);
  		inv.setSugar(maxInventory);
	
  		rList = new Recipe[maxNumRecipe];
  	}
  	
  	public Inventory getInventory() {
  		return this.inv;  		
  	}
  	  	
  	public boolean addRecipe(Recipe rAdd)  {
  		for (int i = 0; i < maxNumRecipe; i++ )
  		{
  			if (this.rList[i] == null) 
  			{
  				this.rList[i] = rAdd;
				this.numRecipes++;
				return true;
			}
		}
  		
  		return false;
  	}
  	
  	public Recipe getRecipe(String recipeName) {
  		for (int i = 0; i < maxNumRecipe; i++ )
  		{
			if (this.rList[i].getRecipeName() == recipeName)
			{
				return this.rList[i];
			}
		}
  		return null;
  	}
  	
  	public boolean deleteRecipe(String recipeName) {
  		for (int i = 0; i < maxNumRecipe; i++ ){
			if (this.rList[i].getRecipeName() == recipeName) {
				this.rList[i] = null;
				this.numRecipes--;
				return true;
			}				
		}
  		
  		return false;  		
  	}
  	
  	public boolean makeCoffee(String recipeName) {
  		Recipe currentRecipe = this.getRecipe(recipeName);
		if (currentRecipe != null) 
		{
			this.inv.setCoffee(this.inv.getCoffee() - currentRecipe.getCoffeeLevel());
			this.inv.setMilk(this.inv.getMilk() - currentRecipe.getMilkLevel());
			this.inv.setSugar(this.inv.getSugar() - currentRecipe.getSugarLevel());
			return true;
		}
		
		return false;
  	}
}