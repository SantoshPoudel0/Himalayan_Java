package networkprogramming.labreport;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncodeExample {
    public static void main(String[] args) {

        String baseUrl = "https://example.com/search";

        String name = "Xabi Poudel";
        String email = "xabi@gmail.com";
        String city = "Kathmandu Nepal";

        String encodedName = URLEncoder.encode(name, StandardCharsets.UTF_8);
        String encodedEmail = URLEncoder.encode(email, StandardCharsets.UTF_8);
        String encodedCity = URLEncoder.encode(city, StandardCharsets.UTF_8);

        String finalUrl = baseUrl + "?name=" + encodedName
                + "&email=" + encodedEmail
                + "&city=" + encodedCity;

        System.out.println("Encoded URL:");
        System.out.println(finalUrl);
    }
}

