/**
 * Demonstate of following control statement: 
 * break, continue, return
 * 
 * - break with / without labels | label指定退到哪一层 (with Python equvalent)
 * - continue with / without labels 
 * - NOTE: label后面需要紧跟循环声明(for/...)
 * - comparison between: break, continue, return
 */

public class ControlStatementDemo{

    public static void main(String[] args) {

        // 1 Break with / without Labels
        //     label指定退到哪一【层】

        System.out.println("break without label ⬇️");
        label1:
        for (int i = 0; i < 5; i++) {
            label2:
            for (int j = 0; j < 5; j++){
                label3:
                System.out.println("i = " + i + ", j = " + j);
                if (j == 1) {
                    break;
                }
            }

        }

        System.out.println();

        System.out.println("break label1 ⬇️");
        label1:
        for (int i = 0; i < 5; i++) {
            label2:
            for (int j = 0; j < 5; j++){
                label3:
                System.out.println("i = " + i + ", j = " + j);
                if (j == 1) {
                    break label1;
                }
            }

        }

        System.out.println();

        System.out.println("break label2 ⬇️");
        label1:
        for (int i = 0; i < 5; i++) {
            label2:
            for (int j = 0; j < 5; j++){
                label3:
                System.out.println("i = " + i + ", j = " + j);
                if (j == 1) {
                    break label2;
                }
            }

        }

        // System.out.println("break label3 ⬇️");
        // label1:
        // for (int i = 0; i < 5; i++) {
        //     label2:
        //     for (int j = 0; j < 5; j++){
        //         label3:
        //         System.out.println("i = " + i + ", j = " + j);
        //         if (j == 1) {
        //             break label3; // ERROR: undefined label: label3
        //         }
        //     }
        // }

        System.out.println();
    

        // 2 Continue with / without Labels
        //     label指定到哪一【层】

        System.out.println("continue without label ⬇️");
        label1:
        for (int i = 0; i < 5; i++) {
            label2:
            for (int j = 0; j < 5; j++){
                label3:
                if (j == 1) {
                    continue;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println("...");
        }

        System.out.println();

        System.out.println("continue label1 ⬇️");
        label1:
        for (int i = 0; i < 5; i++) {
            label2:
            for (int j = 0; j < 5; j++){
                label3:
                if (j == 1) {
                    continue label1;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println("...");
        }

        System.out.println();

        System.out.println("continue label2 ⬇️");
        label1:
        for (int i = 0; i < 5; i++) {
            label2:
            for (int j = 0; j < 5; j++){
                label3:
                if (j == 1) {
                    continue label2;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println("...");
        }

        // System.out.println("continue label2 ⬇️");
        // label1:
        // for (int i = 0; i < 5; i++) {
        //     label2:
        //     System.out.println("hello");
        //     for (int j = 0; j < 5; j++){
        //         label3:
        //         if (j == 1) {
        //             continue label2; //ERROR: undefined label: label2
        //         }
        //         System.out.println("i = " + i + ", j = " + j);
        //     }
        //     System.out.println("...");
        // }

        System.out.println();
        // 3 Comparison Between: Break, Continue, Return

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                System.out.println("Surprise!");
                System.out.println("break");
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("Ending ...");

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                System.out.println("Surprise!");
                System.out.println("continue");
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("Ending ...");

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                System.out.println("Surprise!");
                System.out.println("return");
                return;
            }
            System.out.println("i = " + i);
        }
        System.out.println("Ending ...");

    }

}

/* Python version

The `label1`, `label2`, and `label3` are not used in Python. Instead, 
Python uses indentation to indicate the scope of loops and conditional statements.

The `break label1;` statement in Java is equivalent to the following Python code:

```python
else:
    continue
break
```

---

Example
break with label 1:

```
label1:
for (int i = 0; i < 5; i++) {
    label2:
    for (int j = 0; j < 5; j++){
        label3:
        System.out.println("i = " + i + ", j = " + j);
        if (j == 1) {
            break label1;
        }
    }
}
```
would becomes:

```
for i in range(5):
    for j in range(5):
        print(f"i = {i}, j = {j}")
        if j == 1:
            break
    else:
        continue
    break
```

---

* About `for... else` in Python

-- Using Else Conditional Statement With For loop in Python

In most of the programming languages (C/C++, Java, etc), 
the use of else statement has been restricted with the if conditional statements. 
But Python also allows us to use the else condition with for loops.

The else block just after for/while is executed ONLY when 
    the loop is NOT terminated by a break statement.

Example:

```
for i in range(5):
    if i == 3:
        print("Found 3!")
        break
    else:
        print("Not found yet...")
else:
    print("Loop finished!")
```

Output:

```
Not found yet...
Not found yet...
Not found yet...
Found 3!
```

Or, if not found, would be something like:

```
Not found yet...
Not found yet...
...
Not found yet...
Loop finished!
```

---

*/
