package networkprogramming;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;

public class ProxyExample {
    public static void main(String[] args){
        try{
            SocketAddress proxyAddress = new InetSocketAddress("www.myproxy.example.com", 1080);
            Proxy proxy = new Proxy(Proxy.Type.SOCKS, proxyAddress);

            // create a socket that connects via this process

            Socket socket = new Socket();
            SocketAddress remoteAddress = new InetSocketAddress("login.ibiblio.org", 25);
            socket.connect(remoteAddress);

            System.out.println("Connected via proxy!");
            socket.close();
        } catch (Exception e){
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}
