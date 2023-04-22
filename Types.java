public class Types{

    // class constant: available to multiple methods inside a single class
    public static final double CM_PER_INCH = 2;

    // Enmuerate Type
    enum Size{SMALL, MEDIUM, LARGE, EXTRA_LARGE}; 
    // enum Num{0,1,2}; // TODO: why error

    public static void main(String[] args){

        int vacationDays;
        final double CM_PER_INCH = 2.54; // constant, `final`: its value is set once for all

/* Compiler:
Types.java: error: enum types must not be local
        enum Size{SMALL, MEDIUM, LARGE, EXTRA_LARGE};
        ^
1 error
*/
        // enum Size{SMALL, MEDIUM, LARGE, EXTRA_LARGE}; //error

        Size s;
        // System.out.println(s); // error: s might not have been initialized

        s = Size.MEDIUM;
        System.out.println(s); //MEDIUM

        // Num n = Num.0;
        // System.out.println(Num+1);

    }

}
