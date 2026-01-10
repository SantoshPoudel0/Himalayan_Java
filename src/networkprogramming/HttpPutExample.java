package networkprogramming;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class HttpPutExample {
    public static void main(String[] args) throws Exception {
        // Your original flow (using uri -> url)
        URI uri = new URI("https://jsonplaceholder.typicode.com/posts/1");
        URL url = uri.toURL();  // technically redundant, but kept same as your flow

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("PUT");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Accept", "application/json");
        conn.setDoOutput(true);

        // ✅ Fixed JSON string syntax (your version had escaping errors)
        String jsonInput = "{\"id\":1, \"title\":\"updated title\", \"body\":\"updated body\", \"userId\":1}";

        // Write data to server (same position as you left it unfinished)
        try (OutputStream os = conn.getOutputStream()) {

            os.write(jsonInput.getBytes());
            os.flush();
        }
         int responseCode = conn.getResponseCode();
        System.out.println("Response Code : " + responseCode);

        }
    }

