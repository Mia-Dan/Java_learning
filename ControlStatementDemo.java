/**
 * Demonstate of following control statement: 
 * break, continue, return
 * - break with / without labels
 * - comparison between: break, continue, return
 */

public class ControlStatementDemo{

    public static void main(String[] args) {

        // 1 Break with / without Labels

        System.out.println("break without label ⬇️");
        label1:
        for (int i = 0; i < 5; i++) {
            label2:
            for (int j = 0; j < 5; j++){
                label3:
                System.out.println("i = " + i + ", j = " + j);
                if (j == 1) {
                    break;
                }
            }

        }

        System.out.println();

        System.out.println("break label1 ⬇️");
        label1:
        for (int i = 0; i < 5; i++) {
            label2:
            for (int j = 0; j < 5; j++){
                label3:
                System.out.println("i = " + i + ", j = " + j);
                if (j == 1) {
                    break label1;
                }
            }

        }

        System.out.println();

        System.out.println("break label2 ⬇️");
        label1:
        for (int i = 0; i < 5; i++) {
            label2:
            for (int j = 0; j < 5; j++){
                label3:
                System.out.println("i = " + i + ", j = " + j);
                if (j == 1) {
                    break label2;
                }
            }

        }

        // System.out.println("break label3 ⬇️");
        // label1:
        // for (int i = 0; i < 5; i++) {
        //     label2:
        //     for (int j = 0; j < 5; j++){
        //         label3:
        //         System.out.println("i = " + i + ", j = " + j);
        //         if (j == 1) {
        //             break label3; // ERROR: undefined label: label3
        //         }
        //     }
        // }

    System.out.println();
    
    // 2 Comparison Between: Break, Continue, Return

    for (int i = 0; i < 10; i++) {
        if (i == 2) {
            System.out.println("Surprise!");
            System.out.println("break");
            break;
        }
        System.out.println("i = " + i);
    }
    System.out.println("Ending ...");

    System.out.println();

    for (int i = 0; i < 10; i++) {
        if (i == 2) {
            System.out.println("Surprise!");
            System.out.println("continue");
            continue;
        }
        System.out.println("i = " + i);
    }
    System.out.println("Ending ...");

    System.out.println();

    for (int i = 0; i < 10; i++) {
        if (i == 2) {
            System.out.println("Surprise!");
            System.out.println("return");
            return;
        }
        System.out.println("i = " + i);
    }
    System.out.println("Ending ...");

}
}