package p1;

import p2.C2;

class Test {
  public static void main(String[] args) {
    System.out.println("Runnign p1 Test");

    //create object from a class in the same package
    C1 c1object = new C1();

    //create object from a class in another package
    C2 c2object = new C2();

    //access attribute in an object of another package
    System.out.println(c2object.s2);

    //this wont work because of the private modifier for s1
    //c1object.s1 = "New value";
    //System.out.println(c1object.s1);

    //create my student object and printout
    Student stud1 = new Student("12345", "Ng Keng Yap");
    System.out.println(stud1);  
     
    //change the mobile no and printout
    stud1.mobile = "01112232322";
    System.out.println(stud1);      

    //accessing attributes using getter and setter
    System.out.println("Student name: " + stud1.getName());

    stud1.setMatric("99999");
    //update the matric using setter
    System.out.println("Student: " + stud1);    
  }
}
