public class Parlindrome{
    public static void main(String[] args) {
        int num=12345;
        int rev=0;
        int copy=num;
        while(num>0){
            int temp=num%10;
            rev=rev*10+temp;
            num/=10;
        }
        if(rev==copy){
            System.out.println("parlindrme");
        }
        else{
            System.out.println("not parlindrome");
        }
    }
}