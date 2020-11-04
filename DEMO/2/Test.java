import java.util.*;

public class Test {
  public static void main(String[] args) {
    Student stud1 = new Student("Ng", "12345");    
    Student stud2 = new Student("Ali", "23456");

    System.out.println(stud1.name);

    //print out objects using toString()
    System.out.println(stud1);
    System.out.println(stud2.toString());
            
  }
}
