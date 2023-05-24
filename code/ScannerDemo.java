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

        String correctUsr = "admin";
        String correctPwd = "123";

        // The problem with your code was that you were using the `!=` operator to compare two strings. 
        // The `!=` operator compares the memory addresses of the two strings, which is not what you want.
        // In Java, you should use the `equals()` method instead.  
        System.out.println();
        if(!usr.equals(correctUsr)){ // how to compare Strings
            System.out.println("User not exists");
        } else if (!pwd.equals(correctPwd)) {
            System.out.println("Wrong password");
        } else{
            System.out.println("Login succeed");
        }

        System.out.println("\nWhat has just been entered: \n" + usr + "\n" + pwd); 

        System.out.println("How do you rate this system?");
        int rating = scanner.nextInt();   // convert to int, or raise exceptions
        System.out.println(rating);
        rating = Integer.parseInt(scanner.next()); // another way. String -> int
        System.out.println(rating);
    }
}