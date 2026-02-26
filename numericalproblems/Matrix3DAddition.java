import java.util.*;

public class Matrix3DAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int depth = 2;
        int r = 2;
        int c = 2;

        // -------- INPUT MAT1 (3D) --------
        int[][][] mat1 = new int[depth][r][c];

        for (int d = 0; d < depth; d++) {
            System.out.println("Enter Layer " + d + ":");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("enter value: ");
                    mat1[d][i][j] = sc.nextInt();
                }
            }
        }

        // -------- MANUAL MAT2 (3D) --------
        int[][][] mat2 = new int[depth][r][c];

        // Layer 0
        mat2[0][0][0] = 5;
        mat2[0][0][1] = 6;
        mat2[0][1][0] = 7;
        mat2[0][1][1] = 8;

        // Layer 1
        mat2[1][0][0] = 1;
        mat2[1][0][1] = 2;
        mat2[1][1][0] = 3;
        mat2[1][1][1] = 4;

        // -------- SUM MATRIX (3D) --------
        int[][][] sum_mat = new int[depth][r][c];

        for (int d = 0; d < depth; d++) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    sum_mat[d][i][j] = mat1[d][i][j] + mat2[d][i][j];
                }
            }
        }

        // -------- PRINT RESULT --------
        System.out.println("\n3D Addition Result:");
        for (int d = 0; d < depth; d++) {
            System.out.println("Layer " + d + ":");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(sum_mat[d][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}