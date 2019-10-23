import java.util.Scanner;

public class charCount {
    public static void main(String[] args) {
        String data;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Write a word: ");
        data = keyboard.nextLine();

        System.out.println("No. of characters: " + data.length());
    }

}
