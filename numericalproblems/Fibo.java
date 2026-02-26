public class Fibo{
    public static void main(String[]args){
        int a=0;
        int b=1;
        
        System.out.println(a+ " "+b+" ");//concatenating a,b "0 1 " not adding
        for(int i=2;i<=20;i++){//since 1st two already did i starts from 2
            int temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }

        
    }
}