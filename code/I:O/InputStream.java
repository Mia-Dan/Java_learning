import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 磁盘文件 --> 【Java程序内存】 
// 字节流
public class InputStream{

    public static void main(String[] args) throws IOException{
        String filePath = "lab.txt";

        byte[] buffer = new byte[2]; //一次读取2个字节(bytes). 在utf-8下对应两个字符 
        int readLen = 0;
        FileInputStream fileInputStream = new FileInputStream(filePath);

        //从该输入流读取最多 buffer.length 字节的数据到字节数组。
        //  fileInputStream.read() 此方法将阻塞，直到某些输入可用。
        //  fileInputStream.read() 如果不传入任何variable，则默认 一次读1byte
        //如果返回-1 , 表示读取完毕
        //如果读取正常, 返回实际读取的字节数

        // while (fileInputStream.read(buffer) != -1) { // 为了记住LHS所以：
        while ((readLen = fileInputStream.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, readLen)); // 用数组buffer构造字符串
            // System.out.println(";)");
        }

        fileInputStream.close();

    }
    
}
