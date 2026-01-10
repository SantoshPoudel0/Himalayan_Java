package networkprogramming.LongQuestion2017;

import java.net.*;
import java.util.*;

public class ListNetworkInterface {
    public static void main(String[] args) throws Exception {

        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();

        while(nets.hasMoreElements()) {
            NetworkInterface ni = nets.nextElement();
            System.out.println(ni.getName() + " : " + ni.getDisplayName());

        }
    }
}
