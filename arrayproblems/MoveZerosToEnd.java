public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[]arr={1,0,4,0,2,3,8,9,1,0,4};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
         System.out.print("Array after moving zeros: ");
          for(int num : arr) {
           System.out.print(num + " ");
        }
    }
    
}



