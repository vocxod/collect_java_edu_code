package ru.odybo;

/**
 * String enum 
 * We can do description for enum value
 */
public class StringEnum 
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
    
    enum Size 
    { 
      XSMALL { public String toString(){ return "Это размер XSMALL."; } }, 
      SMALL { public String toString(){ return "Это размер SMALL."; } }, 
      SMALLER { public String toString(){ return "Это размер SMALLER."; } }, 
      SMALLES { public String toString(){ return "Это размер SMALLEST."; } }, 
      MEDIUM { public String toString(){ return "Это размер MEDIUM."; } }, 
      XLARGE { public String toString(){ return "Это размер XLARGE."; } }
    }
    
    public static void main( String[] args )
    {
      Size[] aSizes = Size.values();
      for(int i=30; i < 40; i++){
        System.out.println("\u001B[" + i  + "m **************************************" + ANSI_RESET);
      }
      for(Size sizeItem: aSizes){
        System.out.println(ANSI_BLUE + "ORDINAL:" + sizeItem.ordinal()
            + ANSI_CYAN + " TEXT:" + sizeItem.toString()
            + ANSI_GREEN + "NAME: " + sizeItem.name() + ANSI_RESET );
      }
    }
}
