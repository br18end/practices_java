public class asterisksv4 {
    public static void main(String[] args) {
        int space;
        int space2;
        int asterisk;
        int asterisk2;
        int asterisk3;
        int asterisk4;

        asterisk = 1;
        asterisk2 = 0;
        asterisk3 = 3;
        asterisk4 = 2;
        space = 3;
        space2 = 1;

        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= space - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= asterisk + i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= asterisk2 + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= space2 + i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= asterisk3 - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= asterisk4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
