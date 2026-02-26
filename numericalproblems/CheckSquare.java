import java.util.*;
class CheckSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int i;
        for(i = 1; i*i <= a; i++) {
            if(i*i == a) {
                System.out.println(a + " is a perfect square");
                break;//stops only the for loop.program continues next if block
            }
        }

        if(i*i > a) {
            System.out.println(a + " is NOT a perfect square");
        }
    }
}
