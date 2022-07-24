package ru.odybo;

import java.lang.Class;
import java.lang.reflect.*;

class ReflectionField {

  public static void main(String[] args) {
    try {
      Dog d2 = new Dog();
      Dog d3 = new Dog("Джек Рассел Терьер");

      System.out.println(d2.getType());
      d2.display();
      System.out.println(d3.getType());
      d3.display();
      System.out.println(" ");

       // create an object of Dog
      Dog d1 = new Dog();

      // create an object of Class
      // using getClass()
      Class obj = d1.getClass();

      // access and set the type field
      Field field1 = obj.getField("type");
      field1.set(d1, "labrador");

      // get the value of the field type
      String typeValue = (String) field1.get(d1);
      System.out.println("Value: " + typeValue);

      // get the access modifier of the field type
      int mod = field1.getModifiers();

      // convert the modifier to String form
      String modifier1 = Modifier.toString(mod);
      System.out.println("Modifier: " + modifier1);
      System.out.println(" ");

      // d1.labrador = "LaBrRdOr";
      System.out.println(d1.getType());
      d1.display();
      System.out.println(" ");

      System.out.println(d2.getType());
      d2.display();
      Class toD2 = d2.getClass();
      Field fD2Type = toD2.getField("type");
      fD2Type.set(d2, "УличнаяДворняга");
      System.out.println(d2.getType());
      System.out.println(" ");

      System.out.println(d3.getType());
      d3.display();
      System.out.println(" ");

    }
    
    catch (Exception e) {
      e.printStackTrace();
    }
  }

}
