

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 45, 50};
        int target = 45;

        
        // Linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;  // stop once found
            }
        }

        System.out.println("Element not found.");
    }
}

