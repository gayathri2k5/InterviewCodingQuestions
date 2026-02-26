public class SecondMin {
    public static void main(String[]args){
        int[]arr={67,86,23,11,76};
        int min=Integer.MAX_VALUE;//I used max value so that any number in the array will be smaller than it, making it easy to correctly update the minimum values during comparison.
        int smin=Integer.MAX_VALUE;//if you initialize both smin and min as arr[0] it become the same, and you can never find the second minimum.
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]<smin&&arr[i]!=min){
                smin=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(smin);
    }
    
}

