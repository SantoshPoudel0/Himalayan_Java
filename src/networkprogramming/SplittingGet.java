package networkprogramming;

import java.net.URI;
import java.net.URL;

public class SplittingGet {
    public static void main(String[] args) throws Exception {
        // Example URL
        URI uri = new URI("https://username:password@example.com:8080/blog/article.html?id=3#section2");

        // Convert URI to URL
        URL url = uri.toURL();

        // Print all important parts of the URL
        System.out.println("Full URL: " + url);
        System.out.println("=================================");
        System.out.println("Scheme: " + url.getProtocol());       // Same as getScheme() in URI
        System.out.println("Authority: " + url.getAuthority());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Fragment: " + uri.getFragment());     // Use URI to get fragment (#section)
        System.out.println("User Info: " + url.getUserInfo());
    }
}
