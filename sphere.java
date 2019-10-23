import java.util.Scanner;

public class sphere {
    public static void main(String[] args) {
        int radio;
        double area;
        double volume;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("- Sphere -");
        System.out.print("Radio: ");
        radio = keyboard.nextInt();

        area = 4 * 3.1416 * (radio * radio);
        volume = (4 * 3.1416 * (radio * radio * radio)) / 3;

        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }

}
