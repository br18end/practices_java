import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ConvTempServer {
    public static void main(String[] args) throws IOException {
        while (true) {
            // Create sockets
            ServerSocket serverSocket = null;
            // Establish port for connections
            try {
                serverSocket = new ServerSocket(4444);
                System.out.println("Connecting port: OK");
            } catch (IOException e) {
                System.err.println("Connecting port: Error");
                System.exit(1);
            }
            // Wait for connections
            Socket clientSocket = null;
            try {
                clientSocket = serverSocket.accept();
                System.out.println("Accepting client: OK");
            } catch (IOException e) {
                System.err.println("Accepting client: Error");
                System.exit(1);
            }
            // Create communication with client
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            // Receive data from client
            String buffer;
            buffer = in.readLine();
            System.out.println("Data received: OK");
            // Calculate temperature
            Scanner s = new Scanner(buffer);
            double farenheit = s.nextDouble();
            double celcius = (farenheit - 32.0) / 1.8;
            // Send data to client
            System.out.println("Sending data: OK");
            buffer = Double.toString(celcius);
            out.println(buffer);
            // Close connections
            out.close();
            in.close();
            clientSocket.close();
            serverSocket.close();
        }
    }
}