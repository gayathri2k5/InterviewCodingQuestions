public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = {2, 2, 3, 2, 3, 2,3,3,3};

        int majority = 0; 
        int count = 0;

        // Step 1: Find the majority candidate
        for (int x : arr) {
            if (count == 0) {
                majority = x;//update majority ONLY when count == 0
            }
            if (x == majority) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println("Majority element = " + majority);
    }
}
