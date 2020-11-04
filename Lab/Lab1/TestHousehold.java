/** Author     : Muhammad Harith Bin Zainudin
 * Matric      : 192171
 * Date        : 22 Feb 2018
 * Course Code : SSK3101 
 * Course Name : Computer Programming II
 * Semester    : 2
 * Session     : 2017/2018
 * Lab         : 1
 */
class TestHousehold {
	public static void main(String[] args) {
		
		//create object for the first constructor and print to ensure that constructor work properly
		Household h1 = new Household();
		System.out.println("Occupant: " + h1.getOccupant());
		System.out.println("Income: "+ h1.getIncome());
		System.out.println();
		
		//create object for the second constructor and print to ensure that constructor work properly
		Household h2 = new Household(5);
		System.out.println("Occupant: " + h2.getOccupant());
		System.out.println("Income: "+ h2.getIncome());
		System.out.println();
		
		//create object for the third constructor and print to ensure that constructor work properly
		Household h3 = new Household(10, 5000);
		System.out.println("Occupant: " + h3.getOccupant());
		System.out.println("Income: "+ h3.getIncome());
		System.out.println();
		
		//To check whether the set is working properly
		h3.setIncome(5999);
		h3.setOccupant(50);
		System.out.println("New Income: " + h3.getIncome());
		System.out.println("New Occupant: " + h3.getOccupant());
	}//end of main
}//end of Class TestHousehold
