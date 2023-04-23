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
        System.out.println(ch);
        ch = 'a'; 
        System.out.println(ch);
        ch = 97; // 'a'
        System.out.println(ch);
        ch = '\n';
        System.out.println(ch);


        // 2 representation & storage
        //  char is essentially integer
        //  when output, it looks up `unicode` table

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
            + ('A' - 'a'); // which is diff from lower to upper case
        System.out.println(ch4); // B

        //   uses
        ch4 = 'k'; 
        if (ch4 >= 'a' && ch4 <= 'z') { // if lower case
            // ch4 = ch4 + ('A' - 'a'); // ERROR: ...
            // incompatible types: possible lossy conversion from int to char
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
        System.out.println(ch4); // (whitespace)
        System.out.println((int)ch4); // 32
 
    }
    
}
