package networkprogramming;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncoding {
    public static void main(String[] args) {
        try{
            String filename = "Hello world!";
            String encodedFilename = URLEncoder.encode(filename, StandardCharsets.UTF_8);

            System.out.println("original Filename: " + filename  );
            System.out.println("Encoded Filename: " + encodedFilename);
        } catch (Exception e){
            System.out.println("An error occurred. " +  e.getMessage());
        }
    }
}
