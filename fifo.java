import java.util.Scanner;
public class Cola {
    private final int MAXIMO = 100;
    private int[] V;
    private int inicio;
    private int fin;

    public Cola() {
        this.V = new int[MAXIMO + 1];
        this.inicio = 0;
        this.fin = 0;
    }

    public boolean esVacia() {
        return inicio == fin;
    }

    public boolean esLlena() {
        return tamanio() == MAXIMO - 1;
    }

    public void adicionar(int a) {
        if (esLlena()) {
            System.out.println("Cola Llena!");
        } else {
            fin = (fin + 1) % MAXIMO;
            V[fin] = a;
        }
    }

    public int eliminar() {
        int a = Integer.MIN_VALUE;
        if (esVacia()) {
            System.out.println("Cola Vacia!");
        } else {
            inicio = (inicio + 1) % MAXIMO;
            a = V[inicio];
        }
        return a;
    }

    public int tamanio() {
        return (fin - inicio + MAXIMO) % MAXIMO;
    }

    private void copiar(ColaCircular B) {
        while (!B.esVacia()) {
            adicionar(B.eliminar());
        }
    }

    public void leer() {
        Scanner in = new Scanner(System.in);
        System.out.print("No.Elementos: ");
        int n = in.nextInt();
        System.out.println("Ingrese elementos:");
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            adicionar(a);
        }
    }

    public void mostrar() {
        if (esVacia()) {
            System.out.println("Cola Vacia!");
        } else {
            ColaCircular X = new ColaCircular();
            while (!esVacia()) {
                int a = eliminar();
                System.out.print(" " + a);
                X.adicionar(a);
            }
            this.copiar(X);
            System.out.println("");
        }
    }
}
