package networkprogramming.labreport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogFileProcessing {


    public static void main(String[] args) {

        int infoCount = 0;
        int warningCount = 0;
        int errorCount = 0;

        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\xpoud\\IdeaProjects\\jdbc\\app.log"))) {

            String line;

            while ((line = br.readLine()) != null) {

                if (line.contains("INFO")) {
                    infoCount++;
                } else if (line.contains("WARNING")) {
                    warningCount++;
                } else if (line.contains("ERROR")) {
                    errorCount++;
                }
            }

            System.out.println("Log File Summary");
            System.out.println("INFO messages: " + infoCount);
            System.out.println("WARNING messages: " + warningCount);
            System.out.println("ERROR messages: " + errorCount);

        } catch (IOException e) {
            e.printStackTrace();   // shows real error if file/path is wrong
        }
    }
}
