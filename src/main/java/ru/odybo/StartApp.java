package ru.odybo;

/**
 * Hello world!
 *
 */
public class StartApp 
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
    
    // quant = new Quant();
    
    public static void main( String[] args )
    {
        System.out.println( "Start App!" );
        System.out.println(ANSI_PURPLE + "-< " + ANSI_WHITE + "ru.odybo:melizo" + ANSI_PURPLE + " >-" + ANSI_RESET);
        System.out.println("Max byte value:" + Byte.MAX_VALUE);
        System.out.println("Max int value:" + Integer.MAX_VALUE);
        System.out.println("Max long value:" + Long.MAX_VALUE);
        for(int i=30; i < 40; i++){
          System.out.println("\u001B[" + i  + "m **************************************" + ANSI_RESET);
        }
    }
}
