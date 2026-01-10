package networkprogramming.labreport;

import java.net.*;
import java.util.*;
public class CookieDemo {
    public static void main(String[] args) {
        try {
            // Create and set CookieManager
            CookieManager manager = new CookieManager();
            CookieHandler.setDefault(manager);
            // Open connection to a website
            URL url = new URL("https://www.google.com");
            URLConnection connection = url.openConnection();
            connection.getInputStream(); // Trigger request
            // Retrieve cookies
            CookieStore store = manager.getCookieStore();
            List<HttpCookie> cookies = store.getCookies();
            if (cookies.isEmpty()) {
                System.out.println("No cookies found.");
            } else {
                for (HttpCookie cookie : cookies) {
                    System.out.println("Cookie Name : " + cookie.getName());
                    System.out.println("Cookie Value: " + cookie.getValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}