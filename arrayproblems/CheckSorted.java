import java.util.*;

public class CheckSorted {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 8,4, 5};  // you can change the values to test
        int i;

        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {   // if order breaks
                System.out.println("Array is not sorted");
                break;
            }
        }

        // if loop completed fully without break
        if (i == arr.length - 1) {
            System.out.println("Array is sorted");
        }
    }
}
