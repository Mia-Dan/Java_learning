import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException; 
import java.io.InputStream;

public class Server{
    public static void main(String[] args) throws IOException{

        ServerSocket serverSocket = new ServerSocket(7004);
        System.out.println("server listening at port 7004...");

        Socket socket = serverSocket.accept();
        System.out.println("Server | socket =" + socket.getClass());

        // bind socket's inputstream to inStream
        InputStream inStream = socket.getInputStream();

        // InputStream usage TODO
        byte[] buffer = new byte[1024];
        int readLen = 0;
        while ((readLen = inStream.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, readLen));//根据读取到的实际长度，显示内容. }
        }

        inStream.close();
        socket.close();
        serverSocket.close();

        System.out.println("Server exiting");


    }
    
}