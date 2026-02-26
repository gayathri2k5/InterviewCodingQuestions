import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        // find divisors
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        // check if perfect
        if (sum == n)
            System.out.println(n + " is a Perfect Number.");
        else
            System.out.println(n + " is not a Perfect Number.");
    }
}
