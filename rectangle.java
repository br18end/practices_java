import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        int base;
        int height;
        int area;
        int perimeter;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("- Rectangulo -");
        System.out.print("Base: ");
        base = keyboard.nextInt();
        System.out.print("Height: ");
        height = keyboard.nextInt();

        area = base * height;
        perimeter = base + base + height + height;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

}
