package networkprogramming;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class AllowUserInteractionExample {

    public static void main(String[] args) {
        try{
            URI uri = new URI("https://www.example.com");
            URL url = uri.toURL();

            // open connection
            URLConnection connection = url.openConnection();

            // Enable user interaction

            connection.setAllowUserInteraction(true);

            // check if user interaction is allowed
            System.out.println("Is user interaction allowed ? " + connection.getAllowUserInteraction());

        } catch (URISyntaxException e){
            System.err.println("Invalid URI " + e.getMessage());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
