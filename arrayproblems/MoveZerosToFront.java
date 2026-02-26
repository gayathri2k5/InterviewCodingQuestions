public class MoveZerosToFront {
    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 0, 2, 3, 8, 9, 1, 0, 4};
        int j = arr.length - 1; 

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.print("Array after moving zeros to front: ");
         for(int num : arr) {
           System.out.print(num + " ");
        }
    }
}
