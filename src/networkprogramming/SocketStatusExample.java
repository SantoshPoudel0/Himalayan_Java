package networkprogramming;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketStatusExample {

    public static void main(String[] args) {
        Socket socket = new Socket();  // create an unconnected socket

        System.out.println("Before connecting:");
        printSocketStatus(socket);

        try {
            // Define remote server and port
            InetSocketAddress address = new InetSocketAddress("www.google.com", 80);

            // Bind the socket to a local port
            socket.bind(new InetSocketAddress(0));
            System.out.println("\nAfter binding:");
            printSocketStatus(socket);

            // Connect to the remote server
            socket.connect(address);
            System.out.println("\nAfter connecting:");
            printSocketStatus(socket);

            // Close the socket
            socket.close();
            System.out.println("\nAfter closing:");
            printSocketStatus(socket);

        } catch (IOException e) {
            System.out.println("Socket exception: " + e.getMessage());
        }
    }

    // Function to print current socket status
    public static void printSocketStatus(Socket socket) {
        System.out.println("Is Bound? \t" + socket.isBound());
        System.out.println("Is Connected? \t" + socket.isConnected());
        System.out.println("Is Closed? \t" + socket.isClosed());
    }
}
