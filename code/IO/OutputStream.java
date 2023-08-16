import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


// 【Java程序内存】--> 磁盘文件
// 字节流
public class OutputStream{
    public static void main(String[] args) throws IOException, FileNotFoundException{
        String filePath = "lab.txt";

        //1. new FileOutputStream(filePath) 覆盖原来的内容
        //2. new FileOutputStream(filePath, true) 追加到文件后面
        //  【虽然读起来有些摸不着头脑。但和Python不同，Java应该没有func1(path="...", overwrite=true)这种写法】
        FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);
        fileOutputStream.write("hello".getBytes());
        fileOutputStream.close();

        // func1(a=3);

    }

    // public void func1(int a){
    //     System.out.println("a"+a);
    // }
}