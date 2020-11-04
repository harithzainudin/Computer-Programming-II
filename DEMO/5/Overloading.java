class Overloading {
   
   private String name, address;
   private int age;

   //overloading constructor methods, same method name but different parameters

   public Overloading() {
      //super will be added automatically 
   } 

   public Overloading(String name) {
      this.name = name;
   }

   public Overloading(String name, int age) {
      this.name = name;
      this.age = age;
   }
   
   //invalid because it is the same as OVerloading(String name), 1 string param
   //public Overloading(String address) {
   //   this.address = address;
   //}
 

   //overload any method

   public double multiply(double no1, double no2) {
      return no1 * no2;
   }

   public double multiply(double no1, double no2, double no3) {
      return no1 * no2 * no3;
   }


   public static void main(String[] args) {
      Overloading o = new Overloading("UPM Serdang"); 
   }
}