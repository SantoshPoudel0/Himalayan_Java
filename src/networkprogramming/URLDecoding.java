package networkprogramming;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class URLDecoding {
    public static void main(String[] args) {
        try {
            String encodedFilename = "report+%231.pdf";
            String decodedFilename = URLDecoder.decode(encodedFilename, StandardCharsets.UTF_8);
            System.out.println("encoded filename: " + encodedFilename);
            System.out.println("decoded filename: " + decodedFilename);
        }
        catch(Exception e) {
            System.out.println("An error occurred." + e.getMessage());
        }
    }
}
