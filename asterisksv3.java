public class asterisksv3 {
    public static void main(String[] args) {
        int space;
        int asterisk;
        int asterisk2;

        asterisk = 1;
        asterisk2 = 0;
        space = 3;

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
    }

}
