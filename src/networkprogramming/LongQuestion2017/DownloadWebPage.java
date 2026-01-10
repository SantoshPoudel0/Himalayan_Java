package networkprogramming.LongQuestion2017;

import java.io.*;
import java.net.*;

public class DownloadWebPage {
    public static void main(String[] args) {
        try {
            // URL to download
            URL url = new URL("https://www.santoshpoudel1.com.np");

            // Open stream to read data
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            // Write to local file
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("downloaded_page.html")
            );

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Webpage downloaded successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
