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

    // this code dont compile
    // Alternatives in a multi-catch statement cannot be related by subclassing
    // In this example, ArithmeticException and ArrayIndexOutOfBoundsException are 
    // both subclasses of the Exception class. So, we get a compilation error.
    
    try {
      int array[] = new int[10];
      array[10] = 30 / 0;
    // Dont it! (bellow)
    // } catch (ArrayIndexOutOfBoundsException | ArithmeticException | Exception  e) {
    } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
      System.out.println("Only special exceptions");
      System.out.println(e.getMessage());
    } catch (Exception e){
      System.out.println("All exceptions");
      System.out.println(e.getMessage());
    }
    

    ListOfNumbers list = new ListOfNumbers();
    list.writeList();
  }
}
