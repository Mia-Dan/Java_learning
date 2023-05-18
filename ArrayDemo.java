/**
 * Basics
 *      1. Declaration
 *      2. Creating
 *      3. Initializing
 *      4. Get elem
 * Others
 *      * assignment with `for`, using `<arrayName>.length`
 *      * TODO: 数组中的元素可以是任何数据类型，包括基本类型和引用类型(examples) 
 *      * TODO: What? 数组属引用类型，数组型数据是对象(object). 
 */

import java.util.Scanner;

public class ArrayDemo{
    public static void main(String[] args) {

        // 1. Basis: Declaration, Creating, Initializing, Get elem

        // 1.1 Declaration
        // as with variables of other types, 
        //    - declaration does NOT actually create an array; 
        //      it simply tells the compiler that this variable will hold an array of the specified type.
        //    - an array declaration has two components: 
        //      the array's type and the array's name. 
        // 内存中声明了数组anArrayOfInt，
        // 但没有分配内存空间（仍是空指针）。

        // An array's type is written as `type[]`, 
        //      where type is the data type of the contained elements; 
        //      the brackets are special symbols indicating that this variable holds an array. 
        //      The size of the array is not part of its type (which is why the brackets are empty). 
        int[] anArrayOfInt;

        // ❌ it is DISCOURAGED to place the brackets after the array's name: 
        // float anArrayOfFloats[]; 


        // 1.2. Creating 
        // 分配内存空间
        anArrayOfInt = new int[10];
        // 或者1,2合并为
        // int[] anArrayOfInt = new int[10];


        // 1.3. Initializing
        anArrayOfInt[0] = 100; // initialize first element

        // or 静态赋值（vs 前面的 动态赋值）
        // 1.1+2+3. Declaration & Creating & Initializing
        int[] anArrayOfInt2 = { 
            100, 200, 300,
            400, 500, 600, 
            700, 800, 900, 1000
        };


        // 1.4. Indexing (use)
        // 数组创建后，如果没有赋值，有默认值
        // int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，boolean false，String null

        // address
        System.out.println(anArrayOfInt); 

        // elements
        System.out.println(anArrayOfInt[0]); // 100
        System.out.println(anArrayOfInt[1]); // 0
        System.out.println(anArrayOfInt2[0]); // 100
        System.out.println(anArrayOfInt2[1]); // 200


        // 2. Others

        // Assignment with `for`, <arrayName>.length
        int[] anArrayOfIntFor = new int[4]; 
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < anArrayOfIntFor.length ; i++) {
            System.out.print("Enter the " + i + " th element: ");
            anArrayOfIntFor[i] = myScanner.nextInt();
        }

    }
}