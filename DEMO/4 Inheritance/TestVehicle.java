class TestVehicle {
   public static void main(String[] args) {
      Car car1 = new Car("CCC5", "14R18", 4, "GTR", 4, "aerospace", 6); //4 tyres will be create inside the car usign the code in the vehicle constructor
      Car car2 = new Car("Dunlop CC", "14R19", 7, "Mitsubishi", 4, "aerospace", 6); //7 tyre objects will be created inside the car object using the code in the vehicle constructor    
      System.out.println(car1.toString()); 
      System.out.println(car2.toString()); 
   }

}
