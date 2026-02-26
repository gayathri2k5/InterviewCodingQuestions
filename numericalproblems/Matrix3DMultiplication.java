

import java.util.*;

public class Matrix3DMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int depth = 2;   // number of layers
        int r = 2;       // rows
        int c = 2;       // columns

        // 3-D MATRIX 1 (user input)
        int[][][] mat1 = new int[depth][r][c];

        for (int d = 0; d < depth; d++) {
            System.out.println("Enter values for Layer " + d + ":");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("enter value: ");
                    mat1[d][i][j] = sc.nextInt();
                }
            }
        }

        // 3-D MATRIX 2 (manual values like your example)
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

        // 3-D RESULT MATRIX
        int[][][] mul = new int[depth][r][c];

        // Multiply EACH LAYER like 2D
        for (int d = 0; d < depth; d++) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    mul[d][i][j] = 0;
                    for (int k = 0; k < c; k++) {
                        mul[d][i][j] += mat1[d][i][k] * mat2[d][k][j];
                    }
                }
            }
        }

        // PRINT RESULT
        System.out.println("\nMultiplication Result (3D Matrix):");

        for (int d = 0; d < depth; d++) {
            System.out.println("Layer " + d + ":");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(mul[d][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}