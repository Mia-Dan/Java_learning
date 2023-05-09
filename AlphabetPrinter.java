// course exercise. chap5, question7

public class AlphabetPrinter{

    public static void main(String[] args) {
        /* 需求: 
        输出小写的a-z (即：a b c ... z).

        实现 highlight: 
        much better than hardcode print
        */

        for (char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}