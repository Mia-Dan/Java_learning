// Comments

// 1. one public class per file.
// 2. file name == public class name
//  e.g., this file is, Hello.java

// `Hello` is a public class
// compile by `javac Hello.java`
// run by `java Hello`
public class Hello{

    public static void main(String[] args){

        System.out.println("This is public class `Hello`");
    }

}

// compile by `javac Hello.java`
// run by `java Cat`
class Cat{
    public static void main(String[] args){
        System.out.println("Meow~");
    }
}

// private class Rat{// error: modifier private not allowed here
class Rat{
    public static void main(String[] args){
        System.out.println("...");
    }
}
