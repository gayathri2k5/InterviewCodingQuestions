import java.util.Scanner;

public class ReverseWordOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split(" "); //input:where is my code output:code my is where

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}

//str.split becomes -> "where is my code" → becomes ["where", "is", "my", "code"] so it doesnt reverse by char it reverse by words