import java.util.Scanner;
public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Char:");
        char ch=sc.next().charAt(0);
        if(ch>='A'&&ch<='Z')
        System.out.println((char)(ch+32));
        else if (ch>='a'&&ch<='z') 
        System.out.println((char)(ch-32));
        else
        System.out.println("Invalid");
            
        
    }
    
}
