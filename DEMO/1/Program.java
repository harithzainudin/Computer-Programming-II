//a program to create objects from Student clas (template)

class Program {

  public static void main(String[] args)  {
    //create 2 objects, a and b of type Student

    // keyword new is to create object
     
    //object a
    Student a = new Student();
    a.name = "Ali";
    a.matric = "12345";
    a.sayMyName();    

    //object b
    Student b = new Student();   
    b.name = "Ahmad";
    b.matric = "23444";
    b.sayMyName();

  }

}


