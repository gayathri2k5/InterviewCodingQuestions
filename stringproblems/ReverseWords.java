import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split(" "); // split sentence by spaces

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            String rev = "";

            // reverse each word
            for (int j = w.length() - 1; j >= 0; j--) { //input: where is my code output: erehw si ym edoc


                rev+= w.charAt(j);
            }

            System.out.print(rev + " ");
        }
    }
}

//str.split becomes -> "where is my code" → becomes ["where", "is", "my", "code"] so it doesnt reverse by char it reverse by words