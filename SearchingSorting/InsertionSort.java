 public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {67, 21, 109, 18, 33, 10};
        int n = arr.length;

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("\nSorted array using Insertion Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

