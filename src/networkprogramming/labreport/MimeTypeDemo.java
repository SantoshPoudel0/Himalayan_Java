package networkprogramming.labreport;
import java.net.*;


public class MimeTypeDemo {
    public static void main(String[] args) {
        try {
            // Create URL object
            URL url = new URL("https://www.example.com");
            // Open URL connection
            URLConnection connection = url.openConnection();
            // Get and display MIME type
            String mimeType = connection.getContentType();
            System.out.println("MIME Type: " + mimeType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
