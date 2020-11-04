import java.util.Scanner;
import java.util.Vector;

/**
 * Author      : Ng Keng Yap 
 * Matric      : 
 * Date        : 14 Feb 2018
 * Course Code : SSK3101 
 * Course Name : Computer Programming II
 * Semester    : 2
 * Session     : 2017/2018
 * Lab         : 1
 * Description : This program allows academic administrator to register and list registered students
 */
public class SmpCli {

  //The vector is the storage to keep registered students 
  private static Vector<Student> studentList = new Vector<Student>();
  private static Student[] student = new Student[100];

  //main method is the first method to run when the program is executed.
  public static void main(String[] args) {
   
    //create the scanner object so that we can read input from the standard input
    Scanner scanner = new Scanner(System.in);

    //repeat forever
    while(true) {

      //print the menu
      printMenu();
      
      //print the instruction to input user option according to the menu       
      System.out.print("Enter your option [R/L/X]");

      //read input from standard input and assign to a String variable called input
      String input = scanner.next();

      //use switch and case, evaluate the input, and then call the respective method
      switch(input.toUpperCase()) {
        case "R": register(); break;
        case "L": list(); break;
        case "X": System.exit(0); break;
        default: System.out.println("Invalid input");
      }
    }    
  }
  
  /**
   * print the menu
   */
  public static void printMenu() {
    System.out.println("===========================================");
    System.out.println("MENU FOR SMP CLI (ADMINISTRATOR MODE)");
    System.out.println("===========================================");
    System.out.println("R ->  Register A New Student");
    System.out.println("L ->  List All Students");
    System.out.println("X ->  Exit");
  }
  
  /**
   * create a new student object and then add it to the studentList vector after prompting for input values for student's attributes
   */
  public static void register() {

    //create a new scanner object to read input from the standard input
    Scanner scanner = new Scanner(System.in);

    //create a new student object, the default values for all attributes are null
    Student student = new Student();

    //for each attribute, prompt for user input, and assign to the attributes of the student object
    System.out.print("NAME\t\t: ");
    student.name = scanner.nextLine();
    System.out.print("Matric\t\t: ");
    student.matric = scanner.nextLine();
    System.out.print("Gender\t\t: ");
    student.gender = scanner.nextLine();
    System.out.print("Mobile\t\t: ");
    student.mobile = scanner.nextLine();
    System.out.print("Email\t\t: ");
    student.email = scanner.nextLine();
    System.out.print("YearOfBirth\t: ");
    student.yearOfBirth = scanner.nextInt();

    //add the student object into the studentList vector
    studentList.add(student);
  }

  /**
   * list the students one by one from the studentList vector
   */
  public static void list() {
    System.out.println("===========================================");
    System.out.println("STUDENT LIST");
    System.out.println("===========================================");
    for(Student student: studentList) {
        //call the display() method in the student (display() instance method)
	student.display();   
	System.out.println();
    }
  }

  
}
