package networkprogramming;

import java.io.IOException;
import java.net.Socket;

public class OOBExample {

    public static void main(String[] args) {
        try{
            Socket socket = new Socket("example.com", 8080);

            // Enable OOBINLINE so urgent data is treated as normal data

            socket.setOOBInline(true);
            System.out.println("OOBINLINE enabled !");

            socket.sendUrgentData(3);
            System.out.println("OOBINLINE enabled !");

            socket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
