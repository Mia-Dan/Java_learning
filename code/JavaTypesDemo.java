public class JavaTypesDemo {
// Java is **strongly typed** 强类型语言
// 会根据数据类型给变量分配内存空间 memory is assigned according to the data type of a variable.

  public static void main(String[] args) {
  /* there are two categories of types in Java: 
  - primitive types
  - reference types
  The primitive types are the boolean type and the numeric types which include byte, short, int, long, char, float and double. 
    The term "primitive" in Java refers to a data type that is not an object and has no methods. 
    Primitive types are the most basic data types available within the Java language. 
    They serve as the building blocks of data manipulation in Java and contain pure, simple values of a kind.
  The reference types include class types, interface types and array types.
    Reference types are types that are defined by a class or an interface. 
    They are called reference types because they refer to objects.
  */

    // 1. prmitive types

    // numerical
    byte b = 100;
    short s = 20000;
    int i = 1000000;
    long l = 1000000000000L;
    float f = 3.14f;
    double d = 3.141592653589793;

    // char
    char c = 'A';

    // boolean
    boolean bool = true;

    // 2. reference types
    // class
    // String is one kind of class

    // interface

    // array
  }

}

/* In Python, just
b = 100
s = 20000
...
c = 'A'
b = True

Remeber that, Python is both 
	**strongly typed** 
	**dynamically typed**  
Strong typing means that variables do have a type and that the type matters when performing operations on a variable. 
Dynamic typing means that the type of the variable is determined only during runtime. 
Due to dynamic typing, in Python the same variable can have a different type at different times during the execution.

Python has several built-in data types. The basic data types include:
- **Integers** (int)
- **Floating-point numbers** (float)
- **Complex numbers** (complex)
- **Strings** (str)
- **Booleans** (bool)
Python does not have a byte or short data type like Java does.
*/


/* In weakly typed languages, 
variables can be implicitly coerced (converted into) to another type. 
Examples of weakly typed languages: JavaScript and PHP.

In weakly typed languages, 
memory is allocated based on the value of the variable.
*/




