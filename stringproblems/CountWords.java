import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence :");
        String sentence=sc.nextLine();
        String[]words=sentence.split(" ");
        System.out.println("Total words:"+words.length);

        
    }
    
}
