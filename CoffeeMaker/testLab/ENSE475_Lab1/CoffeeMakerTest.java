
/*
 * Name: Muhammad Ishraf Shafiq Zainuddin
 * ID  : 200342741
 * File: CoffeeMakerTest.java
 * 
 * Reference Author:
 * tdouglas
 */

package ENSE475_Lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CoffeeMakerTest {

	@Test
	public void CoffeeMaker() {
		fail("Not yet implemented");
		
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		Inventory inv = coffeeMaker.getInventory();
		assertEquals(20, inv.getCoffee());
		assertEquals(20, inv.getMilk());
		assertEquals(20, inv.getSugar());
	}

	@Test
	public void GetInventory() {
		fail("Not yet implemented");		
	}

	@Test
	public void AddRecipe() {
		fail("Not yet implemented");
		
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		Recipe coffeeRecipe;
		
		//Single/Dark
		coffeeRecipe = new Recipe("dark", 2, 1, 1);
		Recipe getRecipe;
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
		
		//Double/Double
		coffeeRecipe = new Recipe("double", 2, 2, 2);
		assertEquals(false, coffeeMaker.addRecipe(coffeeRecipe));
		
		//Triple
		coffeeRecipe = new Recipe("triple", 2, 3, 3);
		assertEquals(false, coffeeMaker.addRecipe(coffeeRecipe));
		
		//Quadruple/Diabetes
		coffeeRecipe = new Recipe("diabetes", 2, 4, 4);
		assertEquals(false, coffeeMaker.addRecipe(coffeeRecipe));
	}

	@Test
	public void GetRecipe() {
		fail("Not yet implemented");
		
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		Recipe coffeeRecipe;
		coffeeRecipe = new Recipe("dark", 2, 1, 1);
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
		assertNull(coffeeMaker.getRecipe("diabetes"));
	}

	@Test
	public void DeleteRecipe() {
		fail("Not yet implemented");
		
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		
		Recipe coffeeRecipe;
		coffeeRecipe = new Recipe("dark", 2, 1, 1);
		
		//Delete Recipe
		Recipe deleteRecipe;
		deleteRecipe = new Recipe("dark", 2, 1, 1);
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
				
		//Check Recipe
		Recipe getRecipe;
		getRecipe = coffeeMaker.getRecipe("dark");
		assertEquals("dark", getRecipe.getRecipeName());
		
		//Add Recipe
		coffeeRecipe = new Recipe("double", 2, 2, 2);
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
		getRecipe = coffeeMaker.getRecipe("double");
		assertEquals("double", getRecipe.getRecipeName());
		
		coffeeMaker.deleteRecipe("dark");
		assertNull(coffeeMaker.getRecipe("dark"));
			
	}

	@Test
	public void MakeCoffee() {
		fail("Not yet implemented");
		
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		Recipe coffeeRecipe;
		
		coffeeRecipe = new Recipe("dark",  2, 1, 1);
		Inventory inv;
		
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
		assertEquals(true, coffeeMaker.makeCoffee("dark"));
		
		inv = coffeeMaker.getInventory();
		assertEquals(10, inv.getCoffee());
		
		//Add a new recipe
		coffeeRecipe = new Recipe ("DarkSouls", 20, 0, 0);
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
		
		assertEquals(true, coffeeMaker.makeCoffee("DarkSouls"));
			
	}

}
