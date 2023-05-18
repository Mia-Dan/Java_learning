public class ArrayDemo{
    public static void main(String[] args) {

        // 1. Declaration
        // as with variables of other types, 
        //    - declaration does NOT actually create an array; 
        //      it simply tells the compiler that this variable will hold an array of the specified type.
        //    - an array declaration has two components: 
        //      the array's type and the array's name. 

        // An array's type is written as `type[]`, 
        //      where type is the data type of the contained elements; 
        //      the brackets are special symbols indicating that this variable holds an array. 
        //      The size of the array is not part of its type (which is why the brackets are empty). 
        int[] anArrayOfInt;

        // You can also place the brackets after the array's name:
        float anArrayOfFloats[]; // ❌ this form is DISCOURAGED 
        // However, convention discourages this form; 
        // the brackets identify the array type,
        // and SHOULD appear with the type designation.

        // 2. Creating 
        anArrayOfInt = new int[10];

        // 3. Initializing
        anArrayOfInt[0] = 100; // initialize first element

        // or
        // 1+2+3. Declaration & Creating & Initializing
        int[] anArrayOfInt2 = { 
            100, 200, 300,
            400, 500, 600, 
            700, 800, 900, 1000
        };


        System.out.println(anArrayOfInt[0]); // 100
        System.out.println(anArrayOfInt[1]); // 0
        System.out.println(anArrayOfInt2[0]); // 100
        System.out.println(anArrayOfInt2[1]); // 200


    }
}