package networkprogramming.labreport;

import java.net.InetAddress;
public class IPCheck {
    public static void main(String[] args) throws Exception {
        String ipAddress = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        InetAddress inet = InetAddress.getByName(ipAddress);
        if (inet.getHostAddress().contains(":")) {
            System.out.println("IPv6 Address");
        } else {
            System.out.println("IPv4 Address");
        }
    }
}
