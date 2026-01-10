package networkprogramming.labreport;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
public class URLDecodedExample {
    public static void main(String[] args) {
        String encodedString = "Xabi+Poudel%40gmail.com+Kathmandu+Nepal";
        String decodedString = URLDecoder.decode(
                encodedString, StandardCharsets.UTF_8);
        System.out.println("Encoded String:");
        System.out.println(encodedString);
        System.out.println("\nDecoded String:");
        System.out.println(decodedString);
    }
}

