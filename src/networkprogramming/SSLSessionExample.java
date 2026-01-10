package networkprogramming;

import javax.net.ssl.*;
import java.util.Date;

public class SSLSessionExample {

    // Method to convert byte[] to hex string
    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            SSLSocketFactory factory =
                    (SSLSocketFactory) SSLSocketFactory.getDefault();

            SSLSocket socket =
                    (SSLSocket) factory.createSocket("example.com", 443);

            socket.startHandshake();

            SSLSession session = socket.getSession();

            System.out.println("Session ID: " +
                    bytesToHex(session.getId()));
            System.out.println("Protocol: " +
                    session.getProtocol());
            System.out.println("Cipher Suite: " +
                    session.getCipherSuite());
            System.out.println("Session Creation Time: " +
                    new Date(session.getCreationTime()));

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// utility function to convert byte array to hex

//private static String bytesToHex(byte[] bytes) {
//    StringBuilder sb = new StringBuilder();
//    for (byte b : bytes) {
//        sb.append(String.format("%02X", b));
//    }
//    return sb.toString();
//}