import java.util.Scanner;

public class UniqueRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      
        // Create frequency array for all ASCII characters
        int freq[] = new int[256]; // covers all characters

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
        }

        System.out.println("Unique characters:");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c] == 1) {
                System.out.println(c);
            }
        }

        System.out.println("\nRepeated characters:");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c] > 1) {
                System.out.println(c);
                freq[c] = 0; // to avoid printing again
            }
        }
    }
}

