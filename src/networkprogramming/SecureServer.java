//1. Generate a key pair using the command: Keytool
// -genkeypair -alias myserver -keyalg RSA -keystore // mykeystore.jsk -storepass changeit

// 2. Get certificate signed by a trusted certificate authority

package networkprogramming;

import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.security.SecureRandom;

public class SecureServer {

    public static final int PORT = 7000;
    public static final String ALGORITHM = "TLS";
    public static final String PASSWORD = "Sandy@123"; // should match keystore password

    public static void main(String[] args) {
        try {
            // 1. Load KeyStore
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new FileInputStream("myKeystore.jks"), PASSWORD.toCharArray());

            // 2. Initialize KeyManagerFactory
            KeyManagerFactory kmf =
                    KeyManagerFactory.getInstance("SunX509");
            kmf.init(ks, PASSWORD.toCharArray());

            // 3. Initialize SSLContext
            SSLContext context = SSLContext.getInstance(ALGORITHM);
            context.init(kmf.getKeyManagers(), null, new SecureRandom());

            // 4. Create SSL Server Socket
            SSLServerSocketFactory factory =
                    context.getServerSocketFactory();
            SSLServerSocket serverSocket =
                    (SSLServerSocket) factory.createServerSocket(PORT);

            // 5. Enable cipher suites
            serverSocket.setEnabledCipherSuites(
                    serverSocket.getSupportedCipherSuites()
            );

            System.out.println("Secure server started on port " + PORT);

            // 6. Accept client connections
            while (true) {
                SSLSocket clientSocket =
                        (SSLSocket) serverSocket.accept();

                System.out.println("Accepted connection from "
                        + clientSocket.getInetAddress());

                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream())
                );

                String message;
                while ((message = reader.readLine()) != null) {
                    System.out.println("Received message: " + message);
                }

                clientSocket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
