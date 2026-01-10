package networkprogramming;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class RecommectExample {
    public static void main(String[] args){
        try{
            Socket socket  = new Socket("www.yahoo.com", 80);

            // save the remote address
            SocketAddress yahooAddress = socket.getRemoteSocketAddress();
            System.out.println("Connected to:" + yahooAddress);

            // close the initial connection
            socket.close();

            // create a new socket and reconnect using the saved addresss
            Socket socket2 = new Socket();
            socket2.connect(yahooAddress); // Reconnect to yahoo using the saved address

            // close the second connection
            socket2.close();

        }
        catch (Exception e ){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
