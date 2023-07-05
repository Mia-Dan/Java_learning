import java.net.Socket;
import java.io.IOException; 
import java.io.OutputStream;

public class Client{
    public static void main(String[] args) throws IOException{

        Socket socket = new Socket("127.0.0.1", 7004);
        System.out.println("Client | socket =" + socket.getClass());

        // bind socket's outputstream to inStream
        OutputStream outStream = socket.getOutputStream();

        // OutputStream usage TODO
        outStream.write("hello, this is lain".getBytes()); 

        outStream.close();
        socket.close();

        System.out.println("Client exiting");

    }
    
}