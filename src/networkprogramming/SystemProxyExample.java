package networkprogramming;

import java.net.*;

public class SystemProxyExample {
    public static void main(String[] args) {
        try {
            // Step 1: Set proxy properties for HTTP and HTTPS
            System.setProperty("http.proxyHost", "192.168.1.10");
            System.setProperty("http.proxyPort", "8080");
//            System.setProperty("https.proxyHost", "proxy.example.com");
//            System.setProperty("https.proxyPort", "8443");

            // Step 2: Create a URL object
            URL url = new URL("https://santoshpoudel1.com.np");

            // Step 3: Open a connection (the proxy settings above will be used automatically)
            URLConnection connection = url.openConnection();

            // Step 4: Connect and test
            connection.connect();
            System.out.println("✅ Connected successfully to " + url);

        } catch (Exception e) {
            System.out.println("❌ Connection failed:");
            e.printStackTrace();
        }
    }
}
