package networkprogramming.LongQuestion2017;

import java.io.*;
import java.net.*;

public class chatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server.");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader clientInput = new BufferedReader(
                    new InputStreamReader(System.in));

            String msg;
                while (true) {
                    System.out.print("Client: ");
                    msg = clientInput.readLine(); // client type & reply
                    out.println(msg);  // sent to server

                    msg = in.readLine();   //  waiting for server msg
                    System.out.println("Server: " + msg);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



