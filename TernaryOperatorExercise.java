/** ternary operator 三元运算
 * The conditional operator ?:, aka the ternary operator, takes three operands
 * It is a shorthand way of writing an if-else statement.
 *  
 * `condition ? a : b`
 * Examples are about: 
 *      getting max between two
 *      getting max between three
 * 
 * In Java, `condition ? a : b`
 * In Python, `a if condition else b`
 */

public class TernaryOperatorExercise{

    public static void main(String[] args) {
        int a = 6;
        int b = 5; 
        int c = 10;

        // get maximun between two: a and b
        int max_a_b = a > b ? a : b;
        System.out.println(max_a_b);

        // get maximun between three: a, b and c
        // 冒泡 x 
        // int max_a_b_c = a > b ? ( b > c ? a : (a > c ? a : c)) : ( ... );
        // trival √ 
        // int max_a_b_c = a > b ? (a > c ? a : c) : (b > c ? b : c);
        // or √ 
        // int max_a_b_c = max_a_b > c ? max_a_b : c;
        // which expands to, 
        int max_a_b_c = (a > b ? a : b) > c ?
                             (a > b ? a : b) :
                             c;
        System.out.println(max_a_b_c);

    }
}

/* Python version:

max_a_b = a if a > b else b

max_a_b_c = (a if a > b else b) if (a if a > b else b) > c else c

 */