import java.util.Scanner;
public class UpperToLoweInSentence {   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter a Sentence");
        String result="";
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z')
            result+=(char)(ch+32);
            else if(ch>='a'&&ch<='z')
            result+=(char)(ch-32);
            else
            result+=ch;
        } 
        System.out.println("Converted sentence: " + result);
    } 
    
}  
