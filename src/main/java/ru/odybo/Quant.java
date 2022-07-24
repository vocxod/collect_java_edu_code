package ru.odybo;

/**
 *  Anonimous class 
 *
 */
public class Quant 
{

    private long quantNumber;
    private Quant rootQuant;
    private Quant[] childQuant;
    private int levelLigth; // aka "yarkost" from 0 (black) to 255 (white)

    Quant(){
      this.quantNumber = 0;
      this.rootQuant = null;
      // this.childQuant = 
    }

    @Override
    public String toString(){
      return "qnt: " + quantNumber;
    }

}

