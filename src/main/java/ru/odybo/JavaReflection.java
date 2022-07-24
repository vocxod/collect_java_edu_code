package ru.odybo;

import java.lang.Class;
import java.lang.reflect.*;

/**
 * Java Reflection 
 * In Java, reflection allows us to inspect and manipulate classes, interfaces, constructors,
 * methods, and fields at run time.
 */

public class JavaReflection 
{
    // for colored text
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    enum ComputerLanguages 
    { 
      PHP { public String toString(){ return "PHP."; } }, 
      C { public String toString(){ return "C."; } }, 
      SWIFT { public String toString(){ return "SWIFT."; } }, 
      JAVA { public String toString(){ return "JAVA."; } }, 
    }
    
    public static void main( String[] args) throws ClassNotFoundException
    {
      ComputerLanguages[] aLangs = ComputerLanguages.values();
      for(int i=30; i < 40; i++){
        System.out.println("\u001B[" + i  + "m **************************************" + ANSI_RESET);
      }
      for(ComputerLanguages eLangItem: aLangs){
        System.out.println(ANSI_BLUE + "ORDINAL:" + eLangItem.ordinal()
            + ANSI_CYAN + " TEXT:" + eLangItem.toString()
            + ANSI_GREEN + "NAME: " + eLangItem.name() + ANSI_RESET );
      }
      try{
      
        // 1. Using forName() method
        Class myData = Class.forName("ru.odybo.Quant");
        System.out.println("1: " + ANSI_YELLOW + myData.toString() + ANSI_RESET);
        // 2. Using getClass() method
        Class b = myData.getClass();
        System.out.println("2: " + ANSI_BLUE + b + ANSI_RESET);
        // 3. Using .class extension
        // create an object of Class
        // to reflect the myData class
        /*
        Class c = myData.class;
        System.out.println("3: " + ANSI_YELLOW + c + ANSI_RESET);
*/
      } catch (ClassNotFoundException e) {
        System.out.println(ANSI_RED + "Класс не найден: " + e + ANSI_RESET);
      } catch (Exception e){
        System.out.println(e);
      }

    }
}

