package networkprogramming.LongQuestion2017;

import java.io.*;
import java.net.*;

public class chatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader serverInput = new BufferedReader(
                    new InputStreamReader(System.in));

            String msg;
            while (true) {
                msg = in.readLine();  // wait for client message
                System.out.println("Client: " + msg);

                System.out.print("Server: ");
                msg = serverInput.readLine();  // server types reply
                out.println(msg);   // send to client
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



