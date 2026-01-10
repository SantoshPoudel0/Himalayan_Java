package networkprogramming.labreport;

import java.net.*;
import java.util.Date;
public class IfModifiedSinceDemo {
    public static void main(String[] args) {
        try {
            // Target URL
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            // Set "If-Modified-Since" to 1 day ago
            long oneDayAgo = System.currentTimeMillis() - (24 * 60 * 60 * 1000);
            connection.setIfModifiedSince(oneDayAgo);
            // Connect and get last modified time
            connection.connect();
            long lastModified = connection.getLastModified();
            if (lastModified == 0) {
                System.out.println("Server did not send Last-Modified header.");
            } else {
                System.out.println("Resource Last Modified: " + new Date(lastModified));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}