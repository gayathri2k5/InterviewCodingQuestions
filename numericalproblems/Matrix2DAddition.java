

import java.util.*;

public class Matrix2DAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 2;
        int c = 2;

        int[][] mat1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("enter value: ");
                mat1[i][j] = sc.nextInt();
            }
        }

        int[][] mat2 = new int[2][2];
        mat2[0][0] = 5;
        mat2[0][1] = 6;
        mat2[1][0] = 7;
        mat2[1][1] = 8;

        int[][] sum_mat = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum_mat[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Print ONLY the result
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum_mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}