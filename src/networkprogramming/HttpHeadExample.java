package networkprogramming;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpHeadExample {
    public static void main(String[] args) throws Exception {
        // Create URI and URL
        URI uri = new URI("https://www.google.com");
        URL url = uri.toURL();

        // Open connection
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        // Use HEAD method
        conn.setRequestMethod("HEAD");

        // Get response code
        int responseCode = conn.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        // Print response headers
        for (Map.Entry<String, List<String>> entry : conn.getHeaderFields().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Disconnect
        conn.disconnect();
    }
}
