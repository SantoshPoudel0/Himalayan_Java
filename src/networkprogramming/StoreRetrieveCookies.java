package networkprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;

public class StoreRetrieveCookies {
    public static void main(String[] args) throws Exception {

        // Custom CookieManager that accepts all cookies
        CookieManager customCookieManager = new CookieManager(null, CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(customCookieManager);

        // Request to set cookies
        URI uri = new URI("https://httpbin.org/cookies/set?username=JohnDoe");
        URL url = uri.toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Read response
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            // Optionally print response line by line
            // System.out.println(inputLine);
        }
        in.close();

        // Retrieve stored cookies
        CookieStore cookieStore = customCookieManager.getCookieStore();
        List<HttpCookie> cookies = cookieStore.getCookies();

        System.out.println("Stored cookies:");
        for (HttpCookie cookie : cookies) {
            System.out.println(cookie);
        }
    }
}
