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

public class TestCaloryCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/**User have to enter the name of the food item, total calories, and fat in gram. if the fat is more than total calories
		 * user have to enter again the fat in gram until the fat in gram is lower than the total calories. Then, the system will
		 * show up the percentage of the fat
		 */
		CaloryCalculator food1 = new CaloryCalculator();
		System.out.println("Enter the name of the food item: ");
		food1.foodItem = scan.nextLine();
		System.out.println("Enter the total calories of the food: ");
		food1.totalCalories = scan.nextDouble();
		System.out.println("Enter the number of fat(gram): ");
		food1.fatGram = scan.nextDouble();
		while (food1.fatGram > food1.totalCalories) {
			System.out.println("The input is invalid. Please input again");
			System.out.println("Enter the number of fat(gram): ");
			food1.fatGram = scan.nextDouble();
			if (food1.fatGram < food1.totalCalories)
				break;
		}
		food1.calculate();
		
	}//end of main method
	
}//end of public class TestCaloryCalculator
