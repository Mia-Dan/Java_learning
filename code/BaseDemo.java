/** base 进制
 * demonstrate the representation of binary, octal, decimal, hexadecimal literal in Java
 */

public class BaseDemo{

    public static void main(String[] args) {
        // 1010 interpreted as ...

        // 2 binary literal, 0b... or OB...
        int n1 = 0b1010;
        // 8 octal literal, 0...
        int n3 = 01010;
        // 10 decimal literal
        int n2 = 1010;
        // 16 hexadecimal literal, 0x... or 0X...
        int n4 = 0X10101;

        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n3);
        System.out.println("n4=" + n4);
        // hexadecimal literal, UPPERCASE and lowercase are both ok
        System.out.println(0x23A);
        System.out.println(0x23a);
    }
}

/* Python version:
all similar EXCEPT `0o` for octal, instead of `0` prefix in Java

# 2 binary number, 0b... or OB...
n1 = 0b1010

# 8 octal number, 0o... ⚠️ 
#   leading zeros in decimal integer literals are not permitted; 
#   use an 0o prefix for octal integers
n3 = 0o1010

# 10 decimal number
n2 = 1010

# 16 hexadecimal number, 0x... or 0X...
n4 = 0x10101

*/
