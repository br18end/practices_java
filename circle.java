import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        int radio;
        double area;
        double lenght;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("- Circle -");
        System.out.print("Radio: ");
        radio = keyboard.nextInt();

        area = 3.1416 * (radio * radio);
        lenght = (2 * 3.1416) * radio;

        System.out.println("Area: " + area);
        System.out.println("Lenght: " + lenght);
    }

}
