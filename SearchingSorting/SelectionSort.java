import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 8, 11, 2, 3};

        for (int i = 0; i < arr.length - 1; i++) {  // iterate till second last element
            int min = i;  

            for (int j = i + 1; j < arr.length; j++) {  // find smallest element in remaining array
                if (arr[min] > arr[j]) {
                    min = j;
                }
            } 

            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            System.out.println(Arrays.toString(arr)); // print after each pass
        }
    }
}