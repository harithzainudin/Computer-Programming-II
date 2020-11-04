class TestOverridding extends Object {
   public static void main(String[] args) {
      Child1 c1 = new Child1();
      c1.m1();

      Parent1 p1 = new Parent1();
      p1.m1();

      super.toString();
   }
}


class Parent1 {
   void m1() {
      System.out.println("parent's method m1() is called 1");
      System.out.println("parent's method m1() is called 2");
      System.out.println("parent's method m1() is called 3");
      System.out.println("parent's method m1() is called 4");
      System.out.println("parent's method m1() is called 5");
      System.out.println("parent's method m1() is called 6");
      System.out.println("parent's method m1() is called 7");
   }
}

class Child1 extends Parent1  {
   
   //overidding
   void m1() {
      
     super.m1();

     System.out.println("child's method m1() is called");
   }
}