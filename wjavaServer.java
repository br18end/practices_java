import java.io.*;
import java.net.*;

public class wjavaServer {

    public static int odds(int a, int b) {
        int odds = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                odds++;
            }
        }
        return odds;
    }

    public static int different(int a, int b) {
        int noRep = 0;
        int number;
        int div;
        int aux;
        int num;
        int count = 0;
        int repeated = 0;
        int j = 0;
        for (int i = a; i <= b; i++) {
            number = i;
            div = number / 10;
            num = number % 10;
            aux = number;

            while (aux != 0) {
                aux = aux / 10;
                count++;
            }
            j = count;
            aux = div;

            if (number < 11) {
                noRep++;
            } else {
                while (j != 0) {
                    while (count > 1) {
                        if (div < 10) {
                            if (num == div) {
                                count = 0;
                                repeated++;
                            }
                        } else {
                            if (num == (div % 10)) {
                                repeated++;
                                count = 0;
                                num = div;
                            } else {
                                div = div / 10;
                            }
                        }
                        count--;
                    }
                    div = aux / 10;
                    num = aux % 10;
                    aux = div;
                    count = j - 1;
                    j--;
                }
                if (repeated == 0) {
                    noRep++;
                } else {
                    repeated = 0;
                }
            }
        }
        return noRep;
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(4444);
        } catch (IOException e) {
            System.err.println("Error port: 4444.");
            System.exit(1);
        }

        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Fallo en accept()");
            System.exit(1);
        }

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        int a, b;

        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());
        String mensaje = "odds: " + Servidor.odds(a, b) + ", Different digits: " + Servidor.diferent(a, b);

        out.println(mensaje);

        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}
