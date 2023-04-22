
public class FloatDemo {

    public static void main(String[] args) {
        // float numbers: `float`(单精度) or `double`(双精度) 
        // `double` is more precise, and used more often
        // 浮点型常量(e.g. 1.23)默认为`double`
        // 需要通过`f`声明`float`型常量(e.g. 1.23f)

        // Declarations & Assignment

        float f = 1.23f; // 1.23
        double d = 1.23; // 1.23
        double d2 = 1.23f; // 1.2300000190734863
        System.out.println(f);
        System.out.println(d);
        System.out.println(d2);

        // float f2 = 1.23; // which goes wrong | error: incompatible types: possible lossy conversion from double to float

        d = 1.23e2; // 123.0
        System.out.println(d);
        d = 1.23E2; // 123.0
        System.out.println(d);
        d = 1.23e-2; // 0.0123
        System.out.println(d);

        // Floating Point Representation & Rrecision 

        // 浮点数 = 符号位sign [1 bit] + 指数位exponent + 尾数位fraction
        // 尾数部分可能丢失（与机器的存储表示方式有关），损失精度
        // The limited memory means floating point numbers can only store a certain number of significant digits 
        // -- and that any additional significant digits are lost.
        f = 1.2345678901234567890f; // 4 byte // 1.2345679
        d = 1.2345678901234567890;  // 8 byte // 1.2345678901234567
        System.out.println(f);
        System.out.println(d);

    }
    
}