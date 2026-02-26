public class GCD {
    public static void main(String[] args) {
        // Step 1: Initialize two numbers
        int a = 20;
        int b = 28;

        // Step 2: Apply Euclid's Algorithm
        // Loop continues until b becomes 0
        while (b != 0) {
            int temp = b;  // Store the current value of b in temp
            b = a % b;     // Replace b with the remainder of a divided by b
            a = temp;      // Replace a with old value of b
            // This effectively does: GCD(a, b) = GCD(b, a % b)
        }

        // Step 3: When loop ends, a contains the GCD
        System.out.println("GCD = " + a);
    }
}