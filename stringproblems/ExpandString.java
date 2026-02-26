import java.util.Scanner;

public class ExpandString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();   // example: a2b4c1 or 2a4b1c
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {      // case: a2
                int num = input.charAt(i + 1) - '0';
                for (int j = 0; j < num; j++) output += ch;
                i++; // skip number because we already used 
            } else {                           // case: 2a
                int num = ch - '0';//num variable wont get get confused because each num has its own block.
                char letter = input.charAt(i + 1);
                for (int j = 0; j < num; j++) output += letter;
                i++; // skip letter
            }
        }

        System.out.println(output);
    }
}