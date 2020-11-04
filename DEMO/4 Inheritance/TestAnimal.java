//parent/superclass
class Animal {
   private String type;

   public Animal() {
      super();
   }

   public Animal(String type) {
      this.type = type;
   }
   
   //overriding, override object's toString()
   public String toString() {
      return "This animal is " + type;
   }
}

//subclass
class Mammal extends Animal {
   //a default constructor, override the original default 
   public Mammal() {
      // super(); //gives your error because the default constructor is missing in the superclass
      //System.out.println("blabla");
      super("mammal"); 
   }
}

class TestAnimal {
   public static void main(String[] args) {

      Animal animal = new Animal();
      Animal animal2 = new Animal("mammal");

      System.out.println(animal2.toString());
   }
}
