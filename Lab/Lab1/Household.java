/** Author     : Muhammad Harith Bin Zainudin
 * Matric      : 192171
 * Date        : 22 Feb 2018
 * Course Code : SSK3101 
 * Course Name : Computer Programming II
 * Semester    : 2
 * Session     : 2017/2018
 * Lab         : 1
 */
public class Household{
    public int occupant, annualIncome;

    //constructor that requires no arguments and set occupant and income
    public Household(){
        occupant = 1;
        annualIncome = 0;
    }
    
    //constructor that have 1 argument and assign value to occupant
    public Household(int occupant){
        this.occupant = occupant;
    }
    
    //constructor that have 2 argument and assign value to occupant and income
    public Household(int occupant, int annualIncome){
        this.occupant = occupant;
        this.annualIncome = annualIncome;
    }
    
    //method to set occupant
    void setOccupant(int occupant){
        this.occupant = occupant;
    }
	
    //method to set annual income
    void setIncome(int annualIncome){
        this.annualIncome = annualIncome;
    }
	
    //method to getOccupant and return occupant
    int getOccupant() {
    	return occupant;
    }
	
    //method to getIncome and return annual income
    int getIncome() {
        return annualIncome;
    }
	
}//end of public class Household
