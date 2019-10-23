import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ConvTempClient {
    public static void main(String[] args) throws IOException {
        // Create socket
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        // Get host name or address for connection
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce host (IP address or name): ");
        String host = input.next();
        // Get port for connection
        System.out.print("Introduce port: ");
        int port = input.nextInt();
        // Get temperature to calculate
        System.out.print("Introduce temperature (Farenheit): ");
        double farenheit = input.nextDouble();
        // Make a request and create connections
        try {
            socket = new Socket(host, port);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Connecting to host: Host " + host + " unknown\n");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Connecting to host: Error");
            System.exit(1);
        }
        // Send data to server
        System.out.println("Sending data: OK");
        String buffer = Double.toString(farenheit);
        out.println(buffer);
        // Receive data from server
        buffer = in.readLine();
        System.out.println("Data received: OK\nConvertion: Farenheit " + farenheit + " = " + buffer + " Celsius");
        // Close connections
        out.close();
        in.close();
        socket.close();
    }
}