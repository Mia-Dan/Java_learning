// course exercise. chap5, question8 variant
// with causions commented near where problems once arose.

/* The `java.math` and `java.lang.Math` classes are different 
and have different purposes.

The `java.math` package provides classes for 
    performing arbitrary-precision integer arithmetic (BigInteger), and 
    arbitrary-precision decimal arithmetic (BigDecimal).

The `java.lang.Math` class provides methods for 
    performing basic numeric operations like trigonometric functions, 
    exponential functions, logarithmic functions, square roots, and more 
    on primitive data types like `int`, `double`, and `float`.
*/

import java.lang.Math;

public class PiCalculator{

    public static void main(String[] args) {
        /* 需求:
        use the Leibniz formula to approximate pi
            pi/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ...
        */

        final int MAX_TERM = 100;
        double ApproxiQuarterOfPi = 0.0;

        for (int term = 0; term < MAX_TERM; term++) {

            ApproxiQuarterOfPi += Math.pow(-1, term) / (2 * term + 1);

            // note:
            
            // 1. Math.pow(a, b)
            //     a ^ b 在Java中是bitwise XOR operator
            //     求exponential需要Math.pow(a, b)，它在java.lang.Math中
            //     TODO：java.math是什么包

            // 2. 陷阱
            // ApproxiQuarterOfPi += sign / (2 * term + 1); 不会如你所愿（假设int sign;）
            // 因为term也是int
            // 
            // 假设我们有double型的数据sum
            //     sum += 1/term 得到的是1.0
            //     sum += 1.0/term 得到的才是想要的
            // 因为，
            //     除号上下都是int，他就先按int计算。
            //     然后，做完除法再做自加，
            // 这是运算优先级区别
        }

        double pi = 4 * ApproxiQuarterOfPi;
        System.out.println(pi); 
    }
}