import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {

        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};

        int[] merged = new int[a.length + b.length];

        int k = 0;

        for (int x : a) {
            merged[k++] = x;
        }

        for (int x : b) {
            merged[k++] = x;
        }

        Arrays.sort(merged);

        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}
