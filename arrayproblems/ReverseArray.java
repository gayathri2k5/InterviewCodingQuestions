public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {21, 56, 74, 32};

        
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
