// ChangeChar 转义


public class ChangeChar{

    public static void main(String[] args){
        System.out.println("\\\\: This is the \\\\ example");
        System.out.println("\t Looks like: This is the \\ example");
        System.out.println("If you enter '\\' only like 'This is the \\ example', compiler would take \\ (change-char notion) together with the char right after it as some symbol");
        System.out.println("Then compiler would complain: ChangeChar.java:...: error: illegal escape character");
        System.out.println();

        System.out.println("\\n: This is the \\n example");
        System.out.println("\t Looks like: This is the \n example");
        System.out.println();

        System.out.println("\\r: This is the \\r example");
        System.out.println("\t Looks like: This is the \r example");
        System.out.println();

        System.out.println("\\\" and \\\': This is the \\\" and \\\' example");
        System.out.println("\t Looks like: This is the \" and \' example");
        System.out.println();      
    }

}

