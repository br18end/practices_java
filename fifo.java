import java.util.Scanner;

public class fifo {
    private final int MAX = 100;
    private int[] V;
    private int begin;
    private int end;

    public Fifo() {
        this.V = new int[MAX + 1];
        this.begin = 0;
        this.end = 0;
    }

    public boolean isEmpty() {
        return begin == end;
    }

    public boolean isFull() {
        return fifoLenght() == MAX - 1;
    }

    public void addFifo(int a) {
        if (isFull()) {
            System.out.println("Fifo full!");
        } else {
            end = (end + 1) % MAX;
            V[end] = a;
        }
    }

    public int deleteFifo() {
        int a = Integer.MIN_VALUE;
        if (isEmpty()) {
            System.out.println("Fifo empty!");
        } else {
            begin = (begin + 1) % MAX;
            a = V[begin];
        }
        return a;
    }

    public int fifoLenght() {
        return (end - begin + MAX) % MAX;
    }

    private void copy(FifoCircle B) {
        while (!B.isEmpty()) {
            addFifo(B.deleteFifo());
        }
    }

    public void leer() {
        Scanner in = new Scanner(System.in);
        System.out.print("No.Elements: ");
        int n = in.nextInt();
        System.out.println("Insert elements:");
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            addFifo(a);
        }
    }

    public void showFifo() {
        if (isEmpty()) {
            System.out.println("Fifo empty!");
        } else {
            FifoCircle X = new FifoCircle();
            while (!isEmpty()) {
                int a = deleteFifo();
                System.out.print(" " + a);
                X.addFifo(a);
            }
            this.copy(X);
            System.out.println("");
        }
    }
}
