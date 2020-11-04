
import java.util.*;

// create my class as template/blueprint
class Student {
  String name = null;
  String matric = null;
  String gender = null;
  String mobile = null;
  String email = null;
  int yearOfBirth = 0;

  public Student(String name, String matric) {
    System.out.println("creating student object name " + name + " , matric " + matric);
    this.name = name; //"Ng" = "Ng"
    this.matric = matric;
  }

  public int getAge() {
    Calendar calendar = new GregorianCalendar();
    calendar.setTime(new Date());
    int year = calendar.get(Calendar.YEAR);
    return year - yearOfBirth;
  } 

  public void display() {
    System.out.println("Name\t: " + name);
    System.out.println("Matric\t: " + matric);
    System.out.println("Gender\t: " + gender);
    System.out.println("Mobile\t: " + mobile);
    System.out.println("Email\t: " + email);
    System.out.println("Age\t: " + getAge());
  }

  public String toString() {
    return "Name: " + name + ", Matric: " + matric;
  }
}
