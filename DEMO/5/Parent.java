class Parent {
   public Parent() {
      //super(); //the compiler will add super() by default
      System.out.println("Running default constructor of Parent");
   }

}

class Child extends Parent {
   //without super, overriding ??  
   public Child() {
      //super(); the constructor will add the super() by defalt
      System.out.println("Creating child using default constructor.");      
   } 

   public Child(String name) {
      //super() will be added by default
      //this(); //calling current class constructor
      this(1); //first statement
      System.out.println(name);
   } 

   public Child(int no) {
      //super() added by default
      System.out.println(no);
   }
}
