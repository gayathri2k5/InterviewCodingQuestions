import java.util.Scanner;
public class Addnuminstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        int sum=0;
        for(char c:str.toCharArray()){
            if(Character.isDigit(c))
            sum+=c-'0';//0=48,1=49,2=50,3=51,4=52,5=53
        }
        System.out.println(sum);
    }
    
}
