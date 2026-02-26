public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5,2,1,3,2,1};

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < arr.length; i++) {//outer loop for picks each element.
            int j;//we initialized j seperately because we need to use its value after the loop to compare i==j 
            for (j = 0; j < arr.length; j++) {//inner loop checks if this element appeared earlier.
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {//if same index number found then execute if someother index found same then it is duplicate
                System.out.print(arr[i] + " ");
            }
        }
    }
}

