package networkprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Socket;

public class SoTimeoutExample {
    public static void main(String[] args) {
        try(Socket socket = new Socket("example.com", 80)){
            // get the current timeout value
            int currentTimeout = socket.getSoTimeout();
            System.out.println("Current So_TIMEOUT: " + currentTimeout + "ms");

            // set timeout to 3 minutes
            if(currentTimeout == 0){
                socket.setSoTimeout(180000); // 180,000 ms = 3 minutes
                System.out.println("So_TIMEOUT set to 3 minutes");
            }

            // Try to read data with the timeout
            InputStream in = socket.getInputStream();
            try{
                int data = in.read();  // This waits for data but not longer than SO_TIMEOUT
                System.out.println("Data Received: " + data);

            } catch (InterruptedIOException e){
                System.out.println("Read timed out ! No data received within the timeout.");
            }
            // The socket remains open , so you can try reading again

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
