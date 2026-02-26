import java.util.*;

class EvenOddDifference {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6};

        int evenSum = 0, oddSum = 0;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] % 2 == 0)
                evenSum += arr[i]; // add to even sum
            else
                oddSum += arr[i];  // add to odd sum
        }

        int diff = evenSum - oddSum;

        System.out.println("Difference between sum of even and odd numbers: " + diff);
    }
}
