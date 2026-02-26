import java.util.Scanner;
public class Segregatechartonum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        String numbers="";
        String letters="";
        for(char c:str.toCharArray()){
            if(Character.isDigit(c))
            numbers+=c;
            else
            letters+=c;
        }
        System.out.println(letters+numbers);
        
    }
    
}
