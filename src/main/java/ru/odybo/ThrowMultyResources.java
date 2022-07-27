package ru.odybo;

import java.io.*;
import java.util.*;

class ThrowMultyResources {
  public static void main(String[] args) throws IOException{
    // так требовалось делать в обязательном порядке в JAVA 7
    // try (    // PrintWriter writer = new PrintWriter(new File("testWrite.txt")); {  
    // Начиная с джава 9 работать с ресурсом можно постепенно
    // сначала обявитьа потом поместить в трай
    Scanner scanner = new Scanner(new File("testRead.txt"));
    PrintWriter writer = new PrintWriter(new File("testWrite.txt")); 
    
    try ( scanner; 
          writer )
    { 
      while (scanner.hasNext()) {
        writer.print(scanner.nextLine());
      }
    } 
      /*
      catch (IOException e){
        System.out.println("try-cach-inside");
        Throwable[] suppressedExceptions = e.getSuppressed();
        for (int i=0; i<suppressedExceptions.length; i++) {
          System.out.println("Suppressed exception=>" + suppressedExceptions[i]);
        }
      }
      */
    }
}
