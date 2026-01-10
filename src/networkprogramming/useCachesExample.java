package networkprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class useCachesExample {
    public static void main(String[] args) {
        try {
            // Define the URL
            URI uri = new URI("https://www.example.com");
            URL url = uri.toURL();

            // Open connection
            URLConnection uc = url.openConnection();

            // Disable caching
            uc.setUseCaches(false);

            // Read and print the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();

        } catch (URISyntaxException e) {
            System.err.println("Invalid URI: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
