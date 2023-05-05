Java

https://docs.oracle.com/javase/tutorial/index.html



# 方法

建立代码与计算机的对应关系:

​	e.g., Java　变量声明＼赋值＼重新赋值等　＜－＞　计算机内存中... 变量名指向变量值，变量值修改

​	Python ...





# 背景



## 杂谈

> Java名称来源：印度的Java岛，生产着某种咖啡。这也是图标的由来。
>
> Java：1992创建该语言，1995年发布第一个版本，Java之父被认为是gosling。
>
> SUN名称：Stanford University Network
>
> Oracle名称：直译「神谕」，因为我国神谕往往是占卜后龟壳上的裂纹，即「甲骨文」，所以被这么翻译。
>
> Java技术体系包括：Java SE（基础、核心），Java EE（企业级应用开发的一套解决方案，主要针对web开发 ），Java ME（不流行）
>
> 用途：主要是互联网系统开发（网页），可以用于应用的后台服务器、大数据开发；其他领域也不是不行，比如游戏Minecraft、桌面应用IDEA等，但通常会用其他语言。
>



## 特点

1. 面向对象OOP

2. robust：强类型机制，异常处理，垃圾自动收集等

3. 跨平台性：即，编译好的.class文件可以在不同机器上运行

4. 解释型：即，编译好的代码不能直接在机器上运行，而是需要 解释器

   > 像Javascript也是 解释型语言。
   >
   > 而 编译型语言 则在 编译 后，能直接在机器上运行，如C/C++



## 上手

***everything*** in a Java program must be inside a ***class***.

Java is case-sensitive

```java
// `YourProgram.java` source file
public class YourProgram{ // Java class name convention: CamelCase style
    //...
}
```

To run it, 


```shell
javac YourProgram.java # 编译: java compile 编译，从高级语言->计算机能读懂的机器语言

java YourProgram # 运行: run with JVM # 运行YourProgram.class这个类 # case matters in Java（大小写）
# Note: 不是YourProgram.class [1]
```

> 文件命名也不是随便叫的: .java文件名需要与源代码中public class名(如果有public class)一致

> [1]  `**Could not find or load main class HelloWorldApp.class**`
>
> A common mistake made by beginner programmers is to try and run the `java` launcher on the `.class` file that was created by the compiler. For example, you'll get this error if you try to run your program with `java HelloWorldApp.class` instead of `java HelloWorldApp`. 
>
> **Remember, the argument is the *name of the class* that you want to use, *not* the filename.**

In the Java programming language, all **source code** is first written in plain text files ending with the `.java` extension. Those source files are then **compiled** into `.class` files by the `javac` compiler. A `.class` file does not contain code that is native to your processor; it instead contains ***bytecodes* — the machine language of the Java Virtual Machine**[1](https://docs.oracle.com/javase/tutorial/getStarted/intro/definition.html#FOOT) (Java VM). **The `java` launcher tool then runs your application with an instance of the Java Virtual Machine.**

source code     - - (`javac`) compiler - ->     bytecodes - - (`java`) launcher tool, launch it into JVM 

![Figure showing MyProgram.java, compiler, MyProgram.class, Java VM, and My Program running on a computer.](Java Notes-pic/getStarted-compiler.gif)

Fig 	An overview of the software development process.

Because the Java VM is available on many different operating systems, the same `.class` files are capable of running on Microsoft Windows, Linux, or Mac OS. 

> 即，例子中的MyProgram.class之所以能在Windows, Linux, Mac OS等各平台上运行，实际上是因为它能在JVM for Windows, JVM for Linux, JVM for Mac OS上运行。是JVM完成了解释执行工作。所以能完成了“一次编译（compile，编译得到 xxx.class；source code源代码是xxx.java），到处运行（/执行，指的是xxx.class文件在机器上运行）”
>
> JVM是一个虚拟计算机，具有指令集并且使用不同的存储区域。负责执行指令、管理数据、内存、寄存器等。
>
> Java虚拟机机制屏蔽了底层运行平台的差异，这才实现了“一次编译，到处运行”（运行的命令是`java ...`）

<img src="Java Notes-pic/helloWorld.gif" alt="Figure showing source code, compiler, and Java VM's for Win32, Solaris OS/Linux, and Mac OS" style="zoom:50%;" />

Through the Java VM, the same application is capable of running on multiple platforms.



#### 我们编写的代码 source code

> Source code end with `.java`.



*Everything* in a Java program must be inside a *class*.

* 0 or 1 `public` class in each file

* n class (we don't need `private` modifiers) in each file       // n could be 0, 1, 2, ...



Each class could have its own `main` function (public static void main(String[] args)).



Filename constrants:

* if there's 1 public class, 

​		file name == public class name + .java	

​		e.g., `public class Hello{}` should have  `Hello.java` as filename [1]

* if there's 0 public class,

  no constrant on file name

> [1] .java文件名需要与public class名一致，比如这里Hello.java和Hello2这个类就不match：
>
> ```
> hadoop@Machine:~/Desktop$ javac Hello.java
> Hello.java:11: error: class Hello2 is public, should be declared in a file named Hello2.java
> public class Hello2{
>     ^
> 1 error
> ```



Each statement ends with `;`



source code -- compiler --> bytecodes -- load into JVM and run on (different JVM on) different machines

#### 生成的字节码 bytecodes

> Bytecodes end with `.class`. It's the machine language of the Java Virtual Machine

由`javac`生成，并由`java`命令加载到JVM中运行



1 `.java` file -> n `.class` files, depending on #classes in our source file



To run the `main` method (if any) in a class, run that class.

e.g., `java Cat` run the main method in class `Cat`



#### The Java Platform

**A *platform* is the hardware or software environment in which a program runs.** We've already mentioned some of the most popular platforms like Microsoft Windows, Linux, and Mac OS. *Most platforms can be described as a combination of the operating system and underlying hardware. The Java platform differs from most other platforms in that it's a software-only platform that runs on top of other hardware-based platforms.*

**The Java platform has two components:**

- The *Java Virtual Machine*
- The *Java Application Programming Interface* (API)

You've already been introduced to the Java Virtual Machine; it's the base for the Java platform and is ported onto various hardware-based platforms.

The API is a large collection of ready-made software components that provide many useful capabilities. It is grouped into libraries of related classes and interfaces; these libraries are known as *packages*. The next section, [What Can Java Technology Do?](https://docs.oracle.com/javase/tutorial/getStarted/intro/cando.html) highlights some of the functionality provided by the API.

![Figure showing MyProgram.java, API, Java Virtual Machine, and Hardware-Based Platform](Java Notes-pic/getStarted-jvm.gif)



The API and Java Virtual Machine insulate the program from the underlying hardware.

As a platform-independent environment, the Java platform can be a bit slower than native code. However, advances in compiler and virtual machine technologies are bringing performance close to that of native code without threatening portability.

The terms"Java Virtual Machine" and "JVM" mean a Virtual Machine for the Java platform.





## 基础



#### Java类的组织形式

 	--> package1 -->	interface	-->

​							-->	classes		-->	fields

​												  		-->	constructors	

​												  		-->	methods						

​							-->	exceptions															

----> package2

...

#### Naming conventions

| type           | convention                                                   | examples                                      |
| -------------- | ------------------------------------------------------------ | --------------------------------------------- |
| package        | Use only lowercase letters and digits (no underscores); Consecutive words are simply concatenated together. | com.example.deepspace✅ com.example.deepSpace❌ |
| class          | UpperCamelCase. Typically nouns or noun phrases.             | ImmutableList                                 |
| method         | lowerCamelCase. Typically verbs or verb phrases.             | sendMessage                                   |
| constant names | UPPER_SNAKE_CASE                                             | TAX_RATE                                      |
|                |                                                              |                                               |

For **acronyms** or unusual constructs like "IPv6" or "iOS" 

Beginning with the prose form of the name:

1. Convert the phrase to plain ASCII and remove any apostrophes. For example, "Müller's algorithm" might become "Muellers algorithm".
2. Divide this result into words, splitting on spaces and any remaining punctuation (typically hyphens).
   - *Recommended:* if any word already has a conventional camel-case appearance in common usage, split this into its constituent parts (e.g., "AdWords" becomes "ad words"). Note that a word such as "iOS" is not really in camel case *per se*; it defies *any* convention, so this recommendation does not apply.
3. Now lowercase **everything** (including acronyms), then uppercase only the first character of:
   - ... each word, to yield *upper camel case*, or
   - ... each word except the first, to yield *lower camel case*
4. Finally, join all the words into a single identifier.

Note that the casing of the original words is almost entirely disregarded. Examples:

| Prose form              | Correct             | Incorrect           |
| ----------------------- | ------------------- | ------------------- |
| "XML HTTP request"      | `XmlHttpRequest`    | `XMLHTTPRequest`    |
| "new customer ID"       | `newCustomerId`     | `newCustomerID`     |
| "inner stopwatch"       | `innerStopwatch`    | `innerStopWatch`    |
| "supports IPv6 on iOS?" | `supportsIpv6OnIos` | `supportsIPv6OnIOS` |
| "YouTube importer"      | `YouTubeImporter`   |                     |



#### Java 源码 src

在哪里：

进入jdk目录（Ubuntu可以用`which java`找到jdk安装路径），找到`src.zip`，解压即可

> How to 找到jdk安装路径：
>
> * Ubuntu可以用`which java`
> * Mac可以用`/usr/libexec/java_home -V`
>   * 返回：/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home

源码中有详细的javadoc注释

`src.zip`解压后得到：

![image-20230505163402719](Java Notes-pic/image-20230505163402719.png)

// java.util库，Scanner类。`import java.util.Scanner;`



#### 注释 Comment

> 好习惯：先写注释（这个方法要做什么），再写代码

* 单行注释 // text			The compiler ignores everything from // to the end of the line
* 多行注释 /* text */       The compiler ignores everything from `/*` to `*/`.
* Javadoc注释 /** documentation */

> 注：多行注释，Javadoc注释 不可嵌套。
>
> 这一点在想要注释掉代码的时候需要特别注意：被注释的代码中如果已含有`*/`就会出问题。建议用单行注释



##### 单行、多行注释

> 面向代码维护者的注释。

通常解释程序为什么这么写，如何修改，注意点等

##### Javadoc注释

> 面向调用者的注释。类、方法的注释应使用Javadoc写

Javadoc 能根据注释自动生成一系列网页（用户手册）

在代码中，使用如下记号：

```java
/**
  * 需要注意的是，
  * 注释不允许嵌套 * /（这里为说明，在中间加了空格，以防compiler将它当作结束）
*/
```

在Terminal，使用如下指令生成文档网页：

```shell
javadoc -d <dest_dir_for_HTML> <source file>
# 比如 javadoc -d ~/Desktop/JavadocForThisFile Comment.java
# 不需要手工创建JavadocForThisFile，输入dirname后他会帮我创建
```



##### main函数
The `main` method accepts a single argument: an array of elements of type `String`.

​	public static void main(**String[] args**)

This array is the mechanism through which the runtime system passes information to your application. For example:

​	java *MyApp* *arg1* *arg2*

Each string in the array is called a *command-line argument*. Command-line arguments let users affect the operation of the application without recompiling it. For example, a sorting program might allow the user to specify that the data be sorted in descending order with this command-line argument:

​	-descending



#### API
​	System.out.println("Hello World!");

uses the System class from the core library to print the "Hello World!" message to standard output. This library (also known as the "Application Programming Interface", or "API")



#### Variables

The Java programming language is **statically-typed**, which means that all variables must first be declared before they can be used. This involves stating the variable's type and name, as you've already seen:

​	int gear = 1;

Doing so tells your program that a field named "gear" exists, holds numerical data, and has an initial value of "1". 

##### Data Types

A variable's data type determines the values it may contain, plus the operations that may be performed on it.

The **eight primitive data types** are: byte, short, int, long, float, double, boolean, and char. 

The java.lang.String class represents character strings. 

The compiler will assign a reasonable default value for fields (aka. class / instance variables) of the above types (8 primitive data types + String); for local variables, a default value is never assigned. 

A literal is the source code representation of a fixed value. 

An array is a container object that holds a fixed number of values of a single type. 

* The length of an array is established when the array is created. 
* After creation, its length is fixed.



