import java.net.Socket;
import java.io.IOException; 
import java.io.OutputStream;
import java.io.InputStream;

// TODEBUG
// Client | socket =class java.net.Socket
// Exception in thread "main" java.net.SocketException: Socket is closed
//     at java.net.Socket.getInputStream(Socket.java:903)
//     at Client.main(Client.java:20)

public class Client{
    public static void main(String[] args) throws IOException{

        Socket socket = new Socket("127.0.0.1", 7004);
        System.out.println("Client | socket =" + socket.getClass());

        // a. Send to Server
        // bind socket's outputstream to inStream
        OutputStream outStream = socket.getOutputStream();
        // OutputStream usage TODO
        outStream.write("Hi, Lain".getBytes()); 

        outStream.close();

        // b. Receive from Server
        // bind socket's inputstream to inStream
        InputStream inStream = socket.getInputStream();
        // InputStream usage
        byte[] buffer = new byte[1024];
        int readLen = 0;
        while ((readLen = inStream.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, readLen));//根据读取到的实际长度，显示内容. }
        }

        // outStream.close();
        inStream.close();
        socket.close();

        System.out.println("Client exiting");

    }
    
}