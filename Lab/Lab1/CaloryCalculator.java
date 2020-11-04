/** Author     : Muhammad Harith Bin Zainudin
 * Matric      : 192171
 * Date        : 22 Feb 2018
 * Course Code : SSK3101 
 * Course Name : Computer Programming II
 * Semester    : 2
 * Session     : 2017/2018
 * Lab         : 1
 */
package question3;

import java.util.Scanner;

public class CaloryCalculator {
	public String foodItem;
	public double totalCalories, fatGram;
	
	//constructor that have no arguments and set the attributes to null and 0
	public CaloryCalculator() {
		foodItem = null;
		totalCalories = 0;
		fatGram = 0;
	}
	
	//constructor that have all the arguments
	public CaloryCalculator(String foodItem, double totalCalories, double fatGram) {
		this.foodItem = foodItem;
		this.totalCalories = totalCalories;
		this.fatGram = fatGram;
	}
	
	//method to get food item and return food item
	public String getFoodItem() {
		return foodItem;
	}
	
	//method to set food item
	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	//method to get total calories and return total calories
	public double getTotalCalories() {
		return totalCalories;
	}

	//method to set total calories
	public void setTotalCalories(double totalCalories) {
		this.totalCalories = totalCalories;
	}

	//method to get fat and return fat
	public double getFatGram() {
		return fatGram;
	}

	//method to set fat
	public void setFat(double fatGram) {
		this.fatGram = fatGram;
	}
	
	//method to calculate the percentage of fat and also print the percentage of fat
	public void calculate() {
		double fat = fatGram*9;
		double percentageFat = (fat/totalCalories)/100;
		System.out.println("The percentage of fat in the food is" + percentageFat);
		if (percentageFat < 30)
			System.out.println("The food is low fat");
	}

}//end of public class CaloryCalculator
