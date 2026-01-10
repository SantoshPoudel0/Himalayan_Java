package networkprogramming.labreport;
import java.net.URL;

public class URLCompare {
    public static void main(String[] args) throws Exception {
        URL url1 = new URL("https://example.com/index.html");
        URL url2 = new URL("https://example.com/index.html");
        if (url1.equals(url2)) {
            System.out.println("URLs are equal");
        } else {
            System.out.println("URLs are not equal");
        }
    }
}
