/**
 *  
 *
 */
class Vehicle {
  private Tyre[] tyres;
  protected String engineModel;
  private int seats;  

  /**
   * initialise all the attributes of this object
   */
  public Vehicle(String tyreModel, String tyreSize, int tyreNo, String model, int seats) {
     //create the tyres in a loop
     tyres = new Tyre[tyreNo];
     for(int i=0; i<tyreNo; i++) {
         tyres[i] = new Tyre(tyreModel, tyreSize);
     }    
     this.engineModel = model;
     this.seats = seats;
  }

  public String toString() {
     return "This vehicle has " + this.seats + " seat(s) and engine model " + this.engineModel + " and " + tyres.length + " tyres." ;
  }
   
}

/**
 * represent tyre wheel
 */
class Tyre {
   
   //attributes for tyres  
   private String model;
   private String size; 

   /**
    * Constructor with model and size
    */
   public Tyre(String model, String size) {
      this.model = model;
      this.size = size;
   }
}
