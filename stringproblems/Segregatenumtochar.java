import java.util.Scanner;
public class Segregatenumtochar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.nextLine();
        String number="";
        String letter="";
        for(char c:str.toCharArray()){
            if(Character.isDigit(c)){
             number+=c;
            }
            else{
                letter+=c;
            }
        }
        System.out.println(number+letter);
            
    
    }
}