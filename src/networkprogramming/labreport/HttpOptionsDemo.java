package networkprogramming.labreport;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpOptionsDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://httpbin.org/anything");
            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("OPTIONS");
            connection.connect();

            Map<String, List<String>> headers =
                    connection.getHeaderFields();

            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                if ("Allow".equalsIgnoreCase(entry.getKey())) {
                    System.out.println("Allowed HTTP Methods: "
                            + entry.getValue());
                }
            }

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
