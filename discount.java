import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        double discount;
        double total;
        double price;
        double percent;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("- Shoes -");
        System.out.println("Dollar 20 m.n.");
        System.out.print("Price(Dollar): ");
        price = teclado.nextDouble();
        System.out.print("discount: ");
        percent = teclado.nextDouble();

        percent = percent / 100;
        discount = 13 * price * percent;
        total = (13 * price) - discount;

        System.out.println("Total in m.n. " + total);
    }

}