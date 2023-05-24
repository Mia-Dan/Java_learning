/**
 * Demonstrate `Boolean` type in Java
 */
public class BooleanDemo{
    public static void main(String[] args) {

        // assignment
        // `boolean` type supports only `true` and `false`,
        // other values like `0`, `1`, etc. could NOT be converted into bool

        boolean isPass = true;
        isPass = false;
        // isPass = 1; // ERROR: incompatible types: int cannot be converted to boolean
        // isPass = (boolean) 1; // ERROR: incompatible types: int cannot be converted to boolean
        // int num = isPass; // ERROR: incompatible types: boolean cannot be converted to int

        if(isPass){
            System.out.println("Pass!");
        }
        else{
            System.out.println("Fail!");
        }

    }
}
    
/* in Python

Assigned value to bool could be `True` or `False` (Captialized)
other values can be converted to bool
    `0`, `1`, empty list ... also works in `if`

>>> isPass = False
>>> is_pass = False
>>> if is_pass:
...   print("pass!")
... else:
...   print("fail!")
... 
fail!

---

>>> is_pass = bool(1)
>>> print(is_pass)
True
>>> is_pass = True
>>> num = int(is_pass)
>>> num
1

---

in C
other values like `0`, `1` is also supported

*/