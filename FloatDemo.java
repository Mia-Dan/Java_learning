
public class FloatDemo {

    // constant EPSILON
    public static final double EPSILON = 0.00001;

    public static void main(String[] args) {
        // float numbers: `float`(单精度) or `double`(双精度) 
        // `double` is more precise, and used more often
        // 浮点型常量(e.g. 1.23)默认为`double`
        // 需要通过`f`声明`float`型常量(e.g. 1.23f)

        // 1 Declarations & Assignment

        float f = 1.23f; // 1.23
        double d = 1.23; // 1.23
        double d2 = 1.23f; // 1.2300000190734863
        // float f2 = 1.23; // which goes wrong | error: incompatible types: possible lossy conversion from double to float

        d = 1.23e2; // 123.0
        d = 1.23E2; // 123.0
        d = 1.23e-2; // 0.0123

        // 2 Floating Point Representation & Precision 

        // 浮点数 = 符号位sign [1 bit] + 指数位exponent + 尾数位fraction
        // 尾数部分可能丢失（与机器的存储表示方式有关），损失精度
        // The limited memory means floating point numbers can only store a certain number of significant digits 
        // -- and that any additional significant digits are lost.
        f = 1.2345678901234567890f; // 4 byte // 1.2345679
        d = 1.2345678901234567890;  // 8 byte // 1.2345678901234567

        // 2.1 Caution: Float Number Comparison 

        // some may pass,
        // double a = 3.1;          // 3.1
        // double b = 6.2 / 2.0;    // 3.1

        // other may fail at == .
        // Rounding errors in floating-point Arithmetic
        double a = 2.7;         // 2.7
        double b = 8.1 / 3.0;   // 2.6999999999999997

        System.out.println(a);
        System.out.println(b);

        // fail
        if (a == b){
            System.out.println("a == b");
        }

        // fail
        int res = Double.compare(a,b); // 1
        if (res == 0){
            System.out.println("Double.compare(a,b)");
        }

        // pass
        System.out.println(Math.abs(a - b)); // 4.440892098500626E-16
        if(Math.abs(a - b) < EPSILON) {
            System.out.println("Math.abs(a - b) < EPSILON");
        }
    }
    
}

/* For Python, 
same thing would happen
(Rounding errors in floating-point Arithmetic)
>>> 8.1/3
2.6999999999999997
*/