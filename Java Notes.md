Java

https://docs.oracle.com/javase/tutorial/index.html

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
# Note: YourProgram.java 会被理解成 YourProgram/java（后缀 vs Java中`.`的意思）
```

> 然而.java文件名需要与public class名一致，比如这里Hello.java和Hello2这个类就不match：
> ```
> hadoop@Machine:~/Desktop$ javac Hello.java
> Hello.java:11: error: class Hello2 is public, should be declared in a file named Hello2.java
> public class Hello2{
>        ^
> 1 error
> ```

In the Java programming language, all **source code** is first written in plain text files ending with the `.java` extension. Those source files are then **compiled** into `.class` files by the `javac` compiler. A `.class` file does not contain code that is native to your processor; it instead contains ***bytecodes* — the machine language of the Java Virtual Machine**[1](https://docs.oracle.com/javase/tutorial/getStarted/intro/definition.html#FOOT) (Java VM). **The `java` launcher tool then runs your application with an instance of the Java Virtual Machine.**

source code     - - (`javac`) compiler - ->     bytecodes - - (`java`) into JVM 

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

​		e.g., `public class Hello{}` should have  `Hello.java` as filename

* if there's 0 public class,

  no constrant on file name



Each statement ends with `;`



source code -- compiler --> bytecodes -- load into JVM and run on (different JVM on) different machines

#### 生成的字节码 bytecodes

> Bytecodes end with `.class`. It's the machine language of the Java Virtual Machine

由`javac`生成，并由`java`命令加载到JVM中运行



1 `.java` file -> n `.class` files, depending on #classes in our source file



To run the `main` method (if any) in a class, run that class.

e.g., `java Cat` run the main method in class `Cat`



#### The Java Platform

A *platform* is the hardware or software environment in which a program runs. We've already mentioned some of the most popular platforms like Microsoft Windows, Linux, and Mac OS. **Most platforms can be described as a combination of the operating system and underlying hardware. The Java platform differs from most other platforms in that it's a software-only platform that runs on top of other hardware-based platforms.**

**The Java platform has two components:**

- The *Java Virtual Machine*
- The *Java Application Programming Interface* (API)

You've already been introduced to the Java Virtual Machine; it's the base for the Java platform and is ported onto various hardware-based platforms.

The API is a large collection of ready-made software components that provide many useful capabilities. It is grouped into libraries of related classes and interfaces; these libraries are known as *packages*. The next section, [What Can Java Technology Do?](https://docs.oracle.com/javase/tutorial/getStarted/intro/cando.html) highlights some of the functionality provided by the API.

![Figure showing MyProgram.java, API, Java Virtual Machine, and Hardware-Based Platform](Java Notes-pic/getStarted-jvm.gif)



The API and Java Virtual Machine insulate the program from the underlying hardware.

As a platform-independent environment, the Java platform can be a bit slower than native code. However, advances in compiler and virtual machine technologies are bringing performance close to that of native code without threatening portability.

The terms"Java Virtual Machine" and "JVM" mean a Virtual Machine for the Java platform.
