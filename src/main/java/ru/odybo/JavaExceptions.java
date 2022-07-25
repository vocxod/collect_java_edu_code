package ru.odybo;


class ListOfNumbers {
  public int[] arr = new int[10];

  public void writeList() {

    try {
      arr[1] = 11;
    }
    
    catch (NumberFormatException e1) {
      System.out.println("NumberFormatException => " + e1.getMessage());
    }
    
    catch (IndexOutOfBoundsException e2) {
      System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
    }

  }
}

public class JavaExceptions{

  public static void main(String[] args){
    System.out.println("Start app");

    try {
      int array[] = new int[10];
      array[10] = 30 / 0;
    } catch (Exception | ArithmeticException | ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }

    ListOfNumbers list = new ListOfNumbers();
    list.writeList();
  }
}
