/** 
 * details about type char,
 * and character encoding.
 */
public class CharDemo {

    public static void main(String[] args) {

        // 1 declaration & assignment
        //  char constant is quoted by ''
        //  while "" indicates String

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
        char ch4 = 'a' + 1;
        System.out.println(ch4);
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
        // unicode
            // ASCII -> unicode
            // support more charaters, like Han
            // 2 byte for all
        // utf-8 🌟
            // unicode -> utf-8 
            // 大小可变编码
            // 1 byte for EN chars, 3 bytes for Han chars
            // 对英文不浪费，对汉字可表示的范围更广泛
            // commonly use
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
ord(): char -> int
chr(): int -> char
doesn't supprot underflow on chr()
    e.g., ch4 = chr(ord('A') - ord('a')) would
          raise ValueError: chr() arg not in range(0x110000)
---

>>> ch1 = "中"
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

*/


