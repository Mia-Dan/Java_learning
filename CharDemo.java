/** 
 * details about type char,
 * and character encoding.
 */
public class CharDemo {

    public static void main(String[] args) {

        // 1 declaration & assignment
        //  char constant is quoted by `' '`
        //  while `" "` indicates String

        char ch = '中';
        ch = 'a'; 
        ch = 97; // 'a'
        ch = '\n';


        // 2 representation & storage
        //  char is essentially integer
        //  when input / output, it looks up `unicode` table

        char ch1 = 'a';
        System.out.println(ch1);
        System.out.println((int)ch1); // explicit type convertion
        char ch2 = '中'; 
        System.out.println(ch2);
        System.out.println((int)ch2); // 20013
        char ch3 = 20013; // '中'
        System.out.println(ch3); // 中
        System.out.println((int)ch3); 

        //  ->
        //  can do operations like `+` on char
        //   between char and int
        char ch4 = 'a' + 1; // Note: 不报错，RHS不是"a1"（原因见 3 AutoConvert
        System.out.println(ch4); // 'b' 
        System.out.println((int)ch4); 

        //   between char and char
        ch4 = 'b' 
            + ('A' - 'a') // which is diff from lower to upper case
            ; // B

        //   uses
        ch4 = 'k'; 
        if (ch4 >= 'a' && ch4 <= 'z') { // if lower case
            // ch4 = ch4 + ('A' - 'a'); // ERROR: incompatible types: possible lossy conversion from int to char
            ch4 = (char) (ch4 + ('A' - 'a')); // turn upper case
        }
        System.out.println(ch4); // K
        System.out.println((int)ch4); // 75

        //   uses
        //   about ERROR: possible lossy conversion from int to char
        //      1
        ch4 = (char) ('A' - 'a');
        // ch4 = 'A' - 'a'; // ERROR: possible lossy conversion from int to char
        // GUESS: underflow causes ambiguity
        System.out.println(ch4); // ￠
        System.out.println((int)ch4); // 65504
        //      2
        ch4 = (char) ('a' - 'A');
        ch4 = 'a' - 'A'; // works!
        System.out.println(ch4); // 
        System.out.println((int)ch4); // 32

        ch4 = (char) ('a' / 'A');
        ch4 = 'a' / 'A'; // works!
        System.out.println(ch4); // 
        System.out.println((int)ch4); // 1
 

        //  字符 <-> 码值（int）
        //  存储：        字符'a' -> 码值97 -> 二进制... -> 存储
        //  显示： 显示 <- 字符'a' <- 码值97 <- 二进制...

        // 3 Encoding
        // ASCII
            // early standard by USA 
            // 128 chars supported
            // 1 byte (只用了7 bit)
        // Unicode
            // ASCII -> Unicode 
            // 兼容ASCII
            // `uni` 统一。期望将世界上所有符号都包含在内。
            // 不会出现乱码问题
            // 2 bytes for any 最多能支持65536个字符
        // UTF-8 🌟
            // Unicode -> UTF-8 （为节约存储空间）
            // 大小可变编码
            // 1~6 bytes for a char: 
            //  1 byte for EN chars, 3 bytes for Han chars
            // 对英文不浪费，对汉字可表示的范围更广泛
            // commonly use 是互联网使用最广泛的一种Unicode的实现方式
        // gbk
            // support Han and ...
            // 1 byte for EN chars, 2 bytes for Han chars（没utf-8支持的汉字多）
            // 有时utf-8转gbk会报错，比如因为gbk支持的汉字比utf-8少
        // gb2312
            // more seldom in use than gbk
        // big5
            // 繁体中文，不支持简体中文
    }
    
}

/* Python version:

TLDR;
doesn't have char, have str of len 1 instead
ord(): (str of len 1) -> int 
chr(): int -> (str of len 1) 
doesn't supprot underflow on chr()
    e.g., ch4 = chr(ord('A') - ord('a')) would
          raise ValueError: chr() arg not in range(0x110000)
Python doesn't have automatic type conversion,
    -> doesn't have auto convert from str to int
    e.g., 1 + 'a' would fail
    it use `duck typing` instead
        Duck typing in Python is an application of the duck test
        (aka, if an object walks like a duck and quacks like a duck, 
        (    then it must be a duck
        to determine whether an object can be used for a particular purpose
    With duck typing, an object's suitability is determined by the presence of certain methods and properties 
        rather than its type

--- 1

>>> ch1 = "中"
# String of length 1
# both `' '` and `" "`, and `''' '''` would do in Python
>>> print(ord(ch1))
20013 
# same, unicode

---

>>> int1 = 20013
>>> print(chr(int1))
中

---

>>> ch4 = 'k'
>>> if 'a' <= ch4 <= 'z':
...     ch4 = chr(ord(ch4) + (ord('A') - ord('a')))
... 
>>> print(ch4)
K

---

>>> ch4 = chr(ord('A') - ord('a'))
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
ValueError: chr() arg not in range(0x110000)
# This is one thing that goes different,
# instead of underflow, 
# it does some sanity check

---

>>> ch4 = chr(ord('a') // ord('A'))
>>> print(ord(ch4))
1

---

>>> 'a'+1
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
TypeError: can only concatenate str (not "int") to str

>>> 1+'a'
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
TypeError: unsupported operand type(s) for +: 'int' and 'str'

*/


