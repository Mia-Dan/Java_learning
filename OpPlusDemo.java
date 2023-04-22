/**
* A demonstration of properties of `+` operator in Java 
*/

public class OpPlusDemo{
    public static void main(String[] args) {

        // int + String, 转成String
        // when you concatenate a string with an integer using `+`, 
        // Java converts the integer to a string and then concatenates it with the string
	System.out.println(1 + 3); // 4
	System.out.println(3 + "hello"); // 3hello
	System.out.println("hello" + 3); // hello3

        // 运算顺序：从左到右
	System.out.println("hello" + 1 + 3); // hello13
	System.out.println(1 + 3 + "hello"); // 4hello

    }
}

/* In Python, it would be:
print(1 + 3) # 4
print(3 + "hello") # TypeError: unsupported operand type(s) for +: 'int' and 'str'
print("hello" + str(3)) # hello3
*/
