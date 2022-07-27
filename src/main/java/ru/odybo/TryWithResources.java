package ru.odybo;

import java.io.*;

class TryWithResources{

public static void main(String[] args) {
    String line;
    try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
      while ((line = br.readLine()) != null) {
        System.out.println("Line =>"+line);
      }
    // start catch block
    /*
    } catch (IOException e) {
      System.out.println("IOException in try block =>" + e.getMessage());
    }
    */
    // Second CATCH block
    } catch(IOException e) {
      System.out.println("Thrown exception=>" + e.getMessage());
      // а так получим доступ к возможным подавленным (supPRESsed) исключениям
      // если они были например подавлены от обработчика, прописанного в заголовке
      Throwable[] suppressedExceptions = e.getSuppressed();
      for (int i=0; i<suppressedExceptions.length; i++) {
        System.out.println("Suppressed exception=>" + suppressedExceptions[i]);
      }
    }
  }

}
