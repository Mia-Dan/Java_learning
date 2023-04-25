public class StringConvertionDemo {

    public static void main(String[] args) {

        // prmitive types -> String
        // all 8 types, including `boolean` could
        // ` + ""` would do

        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        // String -> prmitive types

        String s5 = "123";
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

        String s6 = "hello world";
        int num5 = Integer.parseInt(s6);
        // compile succeed
        /* runtime exception
        Exception in thread "main" java.lang.NumberFormatException: For input string: "hello world"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at StringConvertionDemo.main(StringConvertionDemo.java:29)
        */
    }
}

/* Python version

TLDR:
other types -> String |  str()
String -> other types |  int(), float(), ... | eval() 

---

#  prmitive types -> String
n1 = 100
f1 = 1.1
d1 = 4.5
b1 = True
s1 = str(n1)
s2 = ...
print(s1 + " " + s2 + " " + s3 + " " + s4)

---

# String -> prmitive types

s5 = "123"
num1 = int(s5)
num2 = float(s5)
num3 = float(s5)
num4 = int(s5)
print(num1, num2, num3, num4)

>>> eval("1") # <class 'int'>
1
>>> eval("1.2") # <class 'float'>
1.2
>>> eval("hello")
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
  File "<string>", line 1, in <module>
NameError: name 'hello' is not defined

>>> eval("1+2+3") # <class 'int'>
6

*/