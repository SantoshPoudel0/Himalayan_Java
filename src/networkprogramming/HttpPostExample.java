package networkprogramming;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class HttpPostExample {


        public static void main(String[] args) throws Exception {
            URI uri = new URI("https://jsonplaceholder.typicode.com/posts/");  // test api
            URL url = uri.toURL();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // JSON data to send
            String jsonInput = "{\"title\": \"fool\", \"body\": \"bar\",\"userId\":1}";

            // write request body
            try(OutputStream os = conn.getOutputStream()) {
                os.write(jsonInput.getBytes());
                os.flush();
            }

           // Read response code
            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);
        }
    }



