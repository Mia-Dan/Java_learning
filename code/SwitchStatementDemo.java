/**
 * This demo focused on Java's `switch statement` - similar to that in C
 * which is a generalization of go-to - supporting fallthrough rather than pure selection
 * -- further insight see notes
 * distinction from : `switch expression` introduced lately
 * 
 * switch (exp){
 *     case CONSTANT1: 
 *         statement;
 *         break;
 *     case CONSTANT2:
 *         ...
 *     default:
 *         ...
 * };
 * 
 * Type supported:
 *     byte, short, int, char, enum, String | BUT NOT double
 */

import java.util.Scanner;

public class SwitchStatementDemo{

    public static void main(String[] args) {
        // This example is made up by me,
        //   to capture the fallthrough sense of switch statement
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nYou walk by a room and hear someone's talking... ");

        System.out.println("\nSYSTEM: Give a integer between 1-5, and you will get a story generated for you.");
        int seed = scanner.nextInt();
        switch (seed) {
            case 1:
                System.out.println("\n\"Hu... Huha... How do we do... do with the dead body?\"");
            case 2:
                System.out.println("\n\"Under bed. Be quick, you coward.\"");
            case 3:
                System.out.println("\n* noise *");
            case 4:
                System.out.println("\n* noise *");
                System.out.println("You get a very bad feeling about it.");
                System.out.println("\n\"Hello, Amy! What are you doing here?\" You hear your colleague's voice. ");
                System.out.println("A chill run down your spile.");
                System.out.println("You run away out of fear, leaving your colleague confused.");
                System.out.println("\nNobody ever see you since then.");
                break;
            case 5:
                System.out.println("\n* noise *");
                System.out.println("You stand still for some time but can't get what's going on. You walk away.");
                System.out.println("\nNothing happened.");
                break;
            default:
                System.out.println("Illegal input");
        };
        System.out.println();
    }
}