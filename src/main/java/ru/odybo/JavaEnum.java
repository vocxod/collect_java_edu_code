package ru.odybo;

// Source: https://www.programiz.com/java-programming/enums
// Note: The enum constants are usually represented in uppercase.
//
// In Java, enum was introduced to replace the use of int constants.
//
enum Size { 
  SMALL, MEDIUM, LARGE, EXTRALARGE; 
     
  public String getSize() {
    // this will refer to the object SMALL
    switch(this) {
      case SMALL:
        return "small";

      case MEDIUM:
        return "medium";

      case LARGE:
        return "large";

      case EXTRALARGE:
        return "extra large";

      default:
        return null;
      }
  } 

/*
 * Note: Like regular classes, an enum class also may include constructors. 
 * To learn more about it, visit Java enum constructor.
 * https://www.programiz.com/java-programming/enum-constructor
 */

}

// Text colors
enum Tx {
  RED("Красный"), 
  GREEN("Зеленый"), 
  RESET("Системный"), 
  BLUE("Синий"), 
  YELLOW("Желтый"), 
  PURPLE("Пурпур");
  
  private final String carColor;

  // private enum constructor
  private Tx(String carColor) {
    this.carColor = carColor;
  }
  
  public String getColorDescription(){
    return this.carColor;
  }

  // An enum class can include methods and fields just like regular classes.
  public String getColor(){
    switch (this){
      case RED:
        return "\u001B[31m"; 
      case GREEN:
        return "\u001B[32m";
      case BLUE:
        return "\u001B[34m";
      case YELLOW:
        return "\u001B[33m";
      case PURPLE:
        return "\u001B[35m";
      default:
        return "\u001B[0m";
    }
  }
}

class Test {
  
  Size pizzaSize;
  
  public Test(Size pizzaSize) {
   this.pizzaSize = pizzaSize;
  }

  public void orderPizza() {
   switch(pizzaSize) {
     case SMALL:
       System.out.println("I ordered a small size pizza.");
       break;
     case MEDIUM:
       System.out.println("I ordered a medium size pizza.");
       break;
     default:
       System.out.println("I don't know which one to order.");
       break;
   }
  }
}

class JavaEnum {

  public static void prn(String sLine, Tx cColor){
    System.out.println(cColor.getColor() + sLine + Tx.RESET.getColor());
  }

  public static void main(String[] args) {
    Test t1 = new Test(Size.LARGE);
    t1.orderPizza();
    System.out.println(Tx.RED.getColor() + "The size of the pizza is " + Size.SMALL.getSize()
        + Tx.RESET.getColor() );
    Tx cBlue = Tx.BLUE;
    Tx cGreen = Tx.GREEN;
    Tx[] aColors = Tx.values();
    prn("Try standard ENUM methods", Tx.GREEN);
    prn("1. Java Enum ordinal() cBlue.ordinal() = " + cBlue.ordinal(), cBlue);
    prn("2. Enum Tx.GREEN.compareTo(Tx.RESET) = " + Tx.GREEN.compareTo(Tx.RESET), cGreen);
    prn("3. Enum Tx.RED.toString() = " + Tx.RED.toString(), Tx.RED);
    prn("4. Enum Tx.YELLOW.name() = " + Tx.YELLOW.name(), Tx.YELLOW);
    prn("5. Java Enum Tx.valueOf(\"PURPLE\") = " + Tx.valueOf("PURPLE"), Tx.PURPLE);
    for(Tx cItem: aColors){
      prn("6. Print aColors=Tx.values() items: " + cItem.toString() + " : "
          + cItem.getColorDescription(), Tx.RESET);
    }

  }

}
