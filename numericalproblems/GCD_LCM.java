public class GCD_LCM {
    public static void main(String[] args) {
        // Step 1: Initialize two numbers
        int a = 20;
        int b = 28;

        // Step 2: Store original values because a and b will change while finding GCD
        int x = a;
        int y = b;

        // Step 3: Find GCD using Euclid's Algorithm
        while (y != 0) {
            int temp = y;  // store current y
            y = x % y;     // remainder of x divided by y
            x = temp;      // assign old y to x
        }
        int gcd = x;  // x now contains GCD

        // Step 4: Find LCM using formula: LCM = (a * b) / GCD
        int lcm = (a * b) / gcd;

        // Step 5: Print GCD and LCM
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}

//“To find the GCD of two numbers, I use Euclid’s Algorithm. The idea is that the GCD of two numbers a and b is the same as the GCD of b and a % b, where % is the remainder.

//In the program, I keep replacing a with b, and b with a % b in a loop until b becomes zero. At that point, a contains the GCD.