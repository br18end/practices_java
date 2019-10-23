public class asterisks {
    public static void main(String[] args) {
        int asterisk;

        asterisk = 4;

        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= asterisk - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}