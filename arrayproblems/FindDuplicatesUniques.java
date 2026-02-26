public class FindDuplicatesUniques {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 8, 5, 9, 6, 6};

        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0; 
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > 1)
                System.out.print(arr[i] + " ");
        }

        System.out.print("\nUniques: ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == 1)
                System.out.print(arr[i] + " ");
        }
    }
}
