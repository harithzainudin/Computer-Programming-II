package p1;

/**
 * This a Student class with modifiers, setters and getters
 */
class Student {
  private String matric, name;
  public String mobile;

  //constructor to initialise the student object with matric and name
  public Student(String matric, String name) {
    this.matric = matric;
    this.name = name;
  }

  //getter for attribute name
  String getName() {
    return name;
  }

  //setter for attribute matric
  void setMatric(String matric) {
    this.matric = matric;
  }

  //return the string of this object
  public String toString() {
    return "matric: " + matric + ", name: " + name + ", mobile: " + this.mobile; 
  }
}
