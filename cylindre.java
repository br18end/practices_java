import java.util.Scanner;

public class cylindre {
    public static void main(String[] args) {
        int radio;
        int height;
        double area;
        double volume;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("- Cylindre -");
        System.out.print("Radio: ");
        radio = keyboard.nextInt();
        System.out.print("Height: ");
        height = keyboard.nextInt();

        area = (2 * 3.1416) * (radio) * (height + radio);
        volume = 3.1416 * (radio * radio) * height;

        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
}
