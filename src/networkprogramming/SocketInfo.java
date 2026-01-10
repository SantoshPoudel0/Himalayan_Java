package networkprogramming;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SocketInfo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide at least one hostname as an argument.");
            return;
        }

        for (String hostname : args) {
            Socket theSocket = null;

            try {
                System.out.println("Attempting to connect to " + hostname);

                // FIXED: changed host → hostname
                theSocket = new Socket(hostname, 80);

                System.out.println(
                        "Connected to " + theSocket.getInetAddress() +
                                " on port " + theSocket.getPort() +
                                " from port " + theSocket.getLocalPort() +
                                " of " + theSocket.getLocalAddress()
                );

            } catch (UnknownHostException ex) {
                System.err.println("I can't find " + hostname);

            } catch (SocketException ex) {
                System.err.println("Could not connect to " + hostname + ": " + ex.getMessage());

            } catch (IOException ex) {
                System.err.println("I/O error: " + ex.getMessage());

            } finally {
                if (theSocket != null && !theSocket.isClosed()) {
                    try {
                        theSocket.close();
                        System.out.println("Socket to " + hostname + " closed successfully.");
                    } catch (IOException ex) {
                        System.err.println("Error closing socket: " + ex.getMessage());
                    }
                }
            }
        }
    }
}
