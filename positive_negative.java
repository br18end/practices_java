import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        int number;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("number: ");
        number = keyboard.nextInt();

        if (number == 0) {
            System.out.print("number nulo");
        } else if (number > 0) {
            System.out.print("number positivo");
        } else {
            System.out.print("number negativo");
        }
    }

}
