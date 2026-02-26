import java.util.Scanner;
public class CountVowelsConsonents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int vowels=0;
        int consonents=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else{
                consonents++;
            }
           }
           
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonents);
    }
    
}
