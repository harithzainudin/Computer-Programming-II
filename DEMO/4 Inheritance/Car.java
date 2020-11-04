/**
 * inherit from vehicle 
 */
class Car extends Vehicle {
   //2 attributes, actually you have 5 attributes (3 from superclass)
   private String spoilerType;
   private int airbagNo;

   /**
    * constructor to assign values to all 5 attributes
    */ 
    public Car(String tyreModel, String tyreSize, int tyreNo, String engineModel, int seats, String spoilerType, int airbagNo) {
       //calling your superclass constructor, pass in all the arguments (values)
       super(tyreModel, tyreSize, tyreNo, engineModel, seats);
       this.spoilerType = spoilerType;
       this.airbagNo = airbagNo;
    } 
 
    //Overriding
 
    public String toString() {
       return "this is a car with engineModel " + this.engineModel;
     }

}
