
class Animal
{
  private String type;
  
  public Animal() {}
  
  public Animal(String paramString)
  {
    type = paramString;
  }
  
  public String toString() {
    return "This animal is " + type;
  }
}
