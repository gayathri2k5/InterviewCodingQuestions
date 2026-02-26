public class StarPattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {      // number of rows
            for (int j = 1; j <= i; j++) { // print stars in each row
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }

    }
}
