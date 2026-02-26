import java.util.Scanner;
import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()!=b.length()){
            System.out.println("none");
            return;
        }
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
        System.out.println("Yes");
        else 
            System.out.println("No");//input:str1="listen,str2="silent"both contains same letters
        
    }
    
}
