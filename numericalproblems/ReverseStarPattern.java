public class ReverseStarPattern {
    public static void main(String[] args) {

        for (int i = 4; i >= 1; i--) {      // start from 4 stars to 1
            for (int j = 1; j <= i; j++) {  // print stars in each row
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }

    }
}
