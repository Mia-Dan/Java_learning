// Comments

// 1. in each file, 0 or 1 public class
// 2. file name == public class name
//  e.g., this file is, Hello.java

// `Hello` is a public class
// compile by `javac Hello.java`
// run by `java Hello`
 class Helsadlo{

    public static void main(String[] args){

        System.out.println("This is public class `Hello111`");
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
