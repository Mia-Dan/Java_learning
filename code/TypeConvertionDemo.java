/**
 * Demonstrate Type Convertion in Java:
 *  - auto convert 
 *  - force convert
 * 
 * 转换路径：
 * byte[1], short[2], int[4], long[8], float[4], double[8], char[1], boolean[1]
 * char ----------> int -> long -> float -> double
 * byte -> short -> int -> long -> float -> double
 * boolean 不参与转换
 * 
 * auto convert: 赋值/运算时，精度小的类型 自动转换成 精度大的数据类型
 * force convert: 通常用于精度大 -> 精度小
 */

public class TypeConvertionDemo{

    public static void main(String[] args) {

        // 1 auto convert
        // 多种类型运算时，先将 “容量小”的类型 自动转换成 “容量大”的数据类型，再运算
        long l = 12345678901234L;
        float f = l;
        System.out.println("float: " + f); // 1.2345679E13  
        f = f - 12345678901230L;
        System.out.println("f - 12345678901230L: " + f); // 0.0

        // 1.1 byte, short, char 
        //  之间, 
        //  - 不自动转换(变量赋值时不可以自动转换)
        //      - 但是常量赋值可以，赋值时会对常量做范围check
        //          e.g., byte = 1000 会检查在-128~127之间，可以，尽管RHS是int型常量 
        //  - 可以运算
        byte b = 97;
        b = 'a';
        // char ch = b; // ERROR: incompatible types: possible lossy conversion from byte to char
        char ch = 97; 
        // b = ch; // ERROR: incompatible types: possible lossy conversion from char to byte
        System.out.println(b + ch); // 194

        // 1.1 byte, short, char 
        //  同类或之间运算, 转化成int
        byte x = 10;
        byte y = 1;
        // byte z = x + y; // ERROR: incompatible types: possible lossy conversion from int to byte
        int z = x + y;


        // 2 force convert
        // 强制类型转换 能够将容量大的数据类型转换为容量小的数据类型
        // (int) 强制转换为int
        // 注意风险：精度降低, 数据溢出

        // 精度降低
        int num1 = (int) 3.14;
        System.out.println(num1); // 3 

        // 数据溢出
        byte num2 = (byte) 2000;
        System.out.println(num2); // -48 
        // explanantion:
        // 2000 <-> 0b 111 1101 0000 
        // for `int` it is: 0b ...... 0111 1101 0000 
        // take 1 `byte` of it: 0b 1101 0000
        // 计算机使用补码: 最左位sgin bit, 可见负数。（便于记忆的方法：）1101 0000反过来是0010 1111(47)，而0000 0000 + 1111 1111是-1，故推出-48
        // which is -48 in decimal 

        // 前面auto convert失败/看不出的例子，
        //  现在可以：
        retryWithForceConvert();

    }

    public static void retryWithForceConvert(){
    // 前面auto convert失败/看不出问题所在的例子，
    // 用 force convert再来一次

        long l = 12345678901234L;
        float f = l;
        System.out.println("float: " + f); // 1.2345679E13  
        f = (long) f - 12345678901230L;
        System.out.println("f - 12345678901230L: " + f); // 118802.0 
        // 有相差了，体现出 8 byte 的 long 转到 4 byte 的 float 丢掉的部分

        byte b = 97;
        b = 'a';
        char ch = (char) b;
        b = (byte) ch;

        byte x = 10;
        byte y = 1;
        byte z = (byte) (x + y); // 运算完再转byte

    }

}

/*
Python doesn't have automatic type conversion,
    e.g., 1 + 'a' would fail
it use `duck typing` instead
    Duck typing in Python is an application of the duck test
    (aka, if an object walks like a duck and quacks like a duck, 
    (    then it must be a duck
    to determine whether an object can be used for a particular purpose
With duck typing, an object's suitability is determined by the presence of certain methods and properties 
    rather than its type
*/

