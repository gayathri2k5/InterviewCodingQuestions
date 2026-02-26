public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};  // 3 is missing
        int n = 5;  // last number in the sequence

        int total = n * (n + 1) / 2;  // sum of 1 to n
        int sum = 0;

        for (int x : arr) {
            sum += x;
        }

        System.out.println("Missing number: " + (total - sum));
    }
}
