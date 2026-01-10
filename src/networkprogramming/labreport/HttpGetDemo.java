package networkprogramming.labreport;

import java.net.*;
import java.io.*;
public class HttpGetDemo {
    public static void main(String[] args) {
        try {
            // Create URL object
            URL url = new URL("https://www.example.com");
            // Open HTTP connection
            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();
            // Set request method to GET
            connection.setRequestMethod("GET");
            // Read server response
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}