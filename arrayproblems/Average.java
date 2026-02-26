public class Average {
    public static void main(String[] args) {
        int[]arr={23,41,53,28};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            

        }
        double avg=(double)sum/arr.length;
            System.out.println(avg);
        

    }
    
}
