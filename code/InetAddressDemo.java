import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo{
    public static void main(String[] args) throws UnknownHostException{

        // get local InetAddress
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println(localhost);  // 返回 设备名/IP, 域名/IP
        // Wi-Fi off - device.local/127.0.0.1
        // Wi-Fi SHU - device.local/10.88.197.69 

        // get by host_name
        // x InetAddress host1 = InetAddress.getByName("device"); // UnknownHostException: device: nodename nor servname provided, or not known
        // √ InetAddress host1 = InetAddress.getByName("device.local"); // device.local/10.88.197.69
        InetAddress host1 = InetAddress.getByName("localhost"); // localhost/127.0.0.1
        InetAddress host2 = InetAddress.getByName("www.baidu.com"); // www.baidu.com/182.61.200.7, 和同一时刻ping www.baidu.com返回的一致

        // get name
        String localhostName = localhost.getHostName(); // device.local
        String host2Name = host2.getHostName(); // www.baidu.com
        // get ip
        String host2Address = host2.getHostAddress(); // 182.61.200.7
    }
}