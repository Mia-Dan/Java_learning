// PrimitiveTypeDemo.java

public class PrimitiveTypeDemo {

  public static void main(String[] args) {
    // Java has 8 primitive data types: byte, short, int, long, float, double, char and boolean.

    // Format:
    // typeName[#byte it takes]: explanation

    // byte[1]: 8-bit signed integer that can store values from -128 to 127
    byte b = 100;

    // short[2]: 16-bit signed integer that can store values from -32768 to 32767
    short s = 20000;

    // int[4]: 32-bit signed integer that can store values from -2147483648 to 2147483647
    int i = 1000000;

    // long[8]: 64-bit signed integer that can store values from -9223372036854775808 to 9223372036854775807
    long l = 1000000000000L; // L suffix indicates a long literal

    // float[4]: 32-bit floating-point number that can store decimal values up to 6-7 digits of precision
    float f = 3.14f; // f suffix indicates a float literal

    // double[8]: 64-bit floating-point number that can store decimal values up to 15-16 digits of precision
    double d = 3.141592653589793;

    // char[2]: 16-bit Unicode character that can store any single character
    // '汉' is also allowed
    // so 1 byte (128 chars) is NOT enough
    char c = 'A';

    // boolean[1]: 1-bit logical value that can store either true or false
    boolean bool = true;

    // Print the values of the variables
    System.out.println("byte: " + b);
    System.out.println("short: " + s);
    System.out.println("int: " + i);
    System.out.println("long: " + l);
    System.out.println("float: " + f);
    System.out.println("double: " + d);
    System.out.println("char: " + c);
    System.out.println("boolean: " + bool);

    // long, float, byte and short are less commonly used data types, 
    // as they have some limitations or trade-offs in terms of range, precision or memory. 
    // They may be used for specific scenarios where performance or compatibility is important.
  }

}
