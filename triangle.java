import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        int area;
        int base;
        int height;
        int perimeter;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("- Triangle -");

        System.out.print("Base: ");
        base = keyboard.nextInt();
        System.out.print("height: ");
        height = keyboard.nextInt();

        area = (base * height) / 2;
        perimeter = base * 3;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
