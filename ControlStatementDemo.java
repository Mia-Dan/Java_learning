// import java.util.Scanner;

public class ControlStatementDemo{

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                System.out.println("Surprise!");
                System.out.println("break");
                break;
            }
            System.out.println("i = " + i);
        }
        // Scanner sc = new Scanner(System.in);
        System.out.println("Ending ...");
        // sc.next();
    }
}