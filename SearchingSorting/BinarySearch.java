
import java.util.Arrays;
 
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {33, 5, 47, 12, 52, 25, 19};  // unsorted array
        int target = 25;

        // Step 1: Sort the array first
        Arrays.sort(arr);

        // Step 2: Binary search
        int left = 0;//starts from first index
        int right = arr.length - 1;//starts from last index 

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;  // stop once found
            } else if (arr[mid] < target) {
                left = mid + 1;  // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        System.out.println("Element not found.");
    }
}
