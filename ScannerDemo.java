// package: java.util
// class: Scanner
// look inside src/java/util/Scanner.java
import java.util.Scanner;

public class ScannerDemo{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String usr = scanner.next(); //当程序执行到 next 方法时，会等待用户输入
        System.out.println("Enter password: ");
        String pwd = scanner.next();

        System.out.println("\nWhat has just been entered: \n" + usr + "\n" + pwd); 

        System.out.println("How do you rate this system?");
        int rating = scanner.nextInt();   // convert to int, or raise exceptions
        System.out.println(rating);
        rating = Integer.parseInt(scanner.next()); // another way. String -> int
        System.out.println(rating);
    }
}