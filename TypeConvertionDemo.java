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
        // 多种类型运算时，先将 精度小的类型 自动转换成 精度大的数据类型，再运算
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
    }

}

