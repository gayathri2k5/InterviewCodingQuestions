import java.util.Scanner;

public class FindSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int square = 0;
        for(int i = 1; i <= a; i++) {
            square = a * i;  // cube=a*a*i
            if(i == a) {     
                System.out.println("Square of " + a + " is " + square);
            }
        }
    }
    
}
