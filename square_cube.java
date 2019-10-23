import java.util.Scanner;

public class square_cube {
    public static void main(String[] args) {
        int num;
        int square;
        int cube;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Square y Cube");
        System.out.print("Number: ");
        num = keyboard.nextInt();

        square = num * num;
        cube = num * num * num;

        System.out.println("square: " + square);
        System.out.println("Cube: " + cube);
    }

}
