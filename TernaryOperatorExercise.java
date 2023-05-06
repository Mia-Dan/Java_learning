/** 三元运算
 * statement ? p : q
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