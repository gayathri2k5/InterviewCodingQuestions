import java.util.*;

class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int pow = 1; // starting with 2^0 = 1

        for(int i = 1;i<= a;i++) {
            if(pow == a) {
                System.out.println("Power of 2");
                return; // stop entire program(main method) once found
            }
            pow = pow * 2; // multiply by 2 each time
        }

        System.out.println("Not a power of 2");
    }
}
