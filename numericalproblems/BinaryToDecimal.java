import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;     // take rightmost digit
            decimal += lastDigit * Math.pow(2, power);

            power++;
            binary = binary / 10;            // remove last digit
        }

        System.out.println("Decimal = " + decimal);
    }
}