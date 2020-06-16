/*
 * Jordan Tatum This program is a demonstration of the course material we have covered so far within
 * COP 2006. I will be demonstrating the different Data Types within Java, but first we must
 * understand what a Variable is. A variable is essentially a container that holds values within a
 * Java program, and a variable can be declared to use one of the main eight data types offered in
 * Java. The eight data types demonstrated in this program are byte, short, int, long, float,
 * double, char, string, and boolean. Another important concept is scope, and within Java scope
 * refers to the visibility of a variable within a program. Scope is important when building objects
 * due to any variable defined within a class outside of any method can be used by all member
 * methods. Scope and Variables are two important concepts to understand Object Oriented
 * Programming. See Below:
 */
  class JavaVariables {

    // byte: 8 bit int, min -128 & max 127. Useful for conserving memory.
     private byte bus = 1;

    // short: 16 bit int, min -32,768 & max 32,767. Useful for conserving memory.
    private short snails = 1000;

    // int: 32 bit int, -2^31 min & max of (2^31)-1. Great for basic arithmetic without fractional
    // parts, or insane size.
    private int insects = 100000;

    // long: 64 bit int, -2^63 min & max of (2^63)-1. Like an int except much larger range.
    private long lice = 123_456L;

    // float: 32 bit IEEE, Range beyond scope of discussion. Used for fractional parts (decimals)
    private float fish = 123.4f;

    // double: 64 bit IEEE, Range beyond scope of discussion. like a float but much more accurate in
    // terms of it's fractional parts (decimals)
    private double dog = 123.4;

    // char: 16 bit unicode, Stores character data (strings)
    private char cat = 'c';

    // boolean: Strictly used for true or false outcome storage within variables.
    private boolean result = false;

    // Final: A Final Acts as a constant variable within a program and cannot be manipulated or
    // changed.
    private final int CONSTANT = 1;
      
    public void variablesPrint() {
      System.out.println("An example of a byte Stored Within This Program: " + bus);
      System.out.println("An example of a short Stored Within This Program: " + snails);
      System.out.println("An example of a int Stored Within This Program: " + insects);
      System.out.println("An example of a long Stored Within This Program: " + lice);
      System.out.println("An example of a float Stored Within This Program: " + fish);
      System.out.println("An example of a double Stored Within This Program: " + dog);
      System.out.println("An example of a char Stored Within This Program: " + cat);
      System.out.println("An example of a boolean Stored Within This Program: " + result);
      System.out.println("An example of a final int Stored Within This Program: " + CONSTANT);
    }
  }
