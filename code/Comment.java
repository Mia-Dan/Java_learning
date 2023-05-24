/**
 * This class demonstrate various comment:
 * 
 *     // one-line comment
 * 
 *     slash* 
 *     n-line comment
 *     *slash
 * 
 *     slash** 
 *     * Javadoc
 *     *slash
 *     // which gives webpage
 * 
 * note: /* ... *slash would break another /* ... *slash from INSIDE
 *       after seeing the first /*, the compiler ignores everything; it only looks for *slash (I couldn't use that notion here, ya know)
 * @author: Mia 
 * @version: 0.0
 */

public class Comment{

    public static void main(String[] args){
        /**
         * Javadoc explain the varible 
         * where could I found it?
         */
        int a; // one-line / n-line comment would not show up in Javadoc

        System.out.println("To run Javadoc, use:");
        System.out.println("\t javadoc -d <dest location for HTML> <source file>");
        System.out.println("like:");
        System.out.println("\t javadoc -d ~/Desktop/JavadocForThisFile Comment.java");
    }

}

