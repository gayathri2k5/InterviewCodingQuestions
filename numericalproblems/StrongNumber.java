import java.util.Scanner;

public class StrongNumber { //145
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            int fact = 1;

            // find factorial of each digit
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            n /= 10;
        }

        // check if strong
        if (sum == temp)
            System.out.println(temp + " is a Strong Number.");
        else
            System.out.println(temp + " is not a Strong Number.");
    }
}
