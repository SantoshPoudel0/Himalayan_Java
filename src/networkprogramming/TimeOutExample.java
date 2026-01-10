package networkprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class TimeOutExample {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com");
            URL url = uri.toURL();
            URLConnection connection = url.openConnection();

            // set timeouts (5 seconds for connection, 3 seconds for reading)
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            // print timeout values
            System.out.println("Connect Timeout: " + connection.getConnectTimeout() + "ms");
            System.out.println("Read Timeout: " + connection.getReadTimeout() + "ms");

            // open the connection and read data
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            System.out.println("Response: " + reader.readLine());
            reader.close();

        } catch (URISyntaxException e) {
            System.err.println("Invalid URI: " + e.getMessage());
        } catch (SocketTimeoutException e) {
            System.out.println("Socket Timeout");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

