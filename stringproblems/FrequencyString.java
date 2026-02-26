import java.util.Scanner;

public class FrequencyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        String result = "";
        String checked = ""; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (checked.indexOf(ch) == -1) {//checked->String checked="" used to store char to avoid duplicate processing 
                int count = 0;//indexof(ch)used to check char in checked string if found->index num, not found->-1,-1 denotes absence  
                for (int j = 0; j < s.length(); j++) {//if the if condition becomes true i.e when new char found it will return -1,-1==-1 j loop runs
                    if (s.charAt(j) == ch) {
                        count++; 
                    }
                }
                result += ch + "" + count; 
                checked += ch; 
            }
        }


        System.out.println("Character frequency: " + result);
    }
}