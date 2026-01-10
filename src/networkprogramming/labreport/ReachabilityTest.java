package networkprogramming.labreport;

import java.net.InetAddress;
public class ReachabilityTest {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("google.com");
        if (address.isReachable(3000)) {
            System.out.println("Host is reachable");
        } else {
            System.out.println("Host is not reachable");
        }
    }
}

