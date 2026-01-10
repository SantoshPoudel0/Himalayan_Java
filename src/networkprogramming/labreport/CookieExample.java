package networkprogramming.labreport;

import java.net.*;
public class CookieExample {
    public static void main(String[] args) {
        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
        HttpCookie cookie = new HttpCookie("username", "xabi");
        cookie.setDomain("example.com");
        cookie.setPath("/");
        cookieManager.getCookieStore().add(null, cookie);
        System.out.println("Stored Cookies:");
        for (HttpCookie c : cookieManager.getCookieStore().getCookies()) {
            System.out.println(c);
        }
    }
}
