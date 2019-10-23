public class asterisksv2 {
    public static void main(String[] args) {
        int space;
        int asterisk;

        asterisk = 1;
        space = 3;

        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= space - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= asterisk + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}