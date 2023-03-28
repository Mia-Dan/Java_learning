public class Types{

    // class constant: available to multiple methods inside a single class
    // `static` `final`
    public static final double CM_PER_INCH = 2;

    public static void main(String[] args){

        int vacationDays;
        vacationDays = 12;
        System.out.println(vacationDays);

        // constant: use `final` to denote constant
        // `final`: its value is set once for all
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in cms 0: "
            + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

        // the res uses CM_PER_INCH = 2.54
        // overwrite
    }
}
