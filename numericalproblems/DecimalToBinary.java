import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();

        String binary = "";

        while (decimal > 0) {
            int rem = decimal % 2;      // remainder (0 or 1)
            binary = rem + binary;      // add at front
            decimal = decimal / 2;      // reduce number
        }

        System.out.println("Binary = " + binary);
    }
}