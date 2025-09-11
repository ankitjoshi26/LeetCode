// https://leetcode.com/problems/set-matrix-zeroes/

package LeetCode;

import java.util.Arrays;

public class leetcode_Q73 {

    public static void main(String[] args){
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        // Call the function
        setZeroes(matrix);

        // Print final matrix
        System.out.println("Final Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Function to set matrix zeroes (Optimal Approach)
    static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // STEP 1: Check first row for zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // STEP 2: Check first column for zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // STEP 3: Use first row & col as markers (skip 0th row & 0th col)
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;  // Mark this row
                    matrix[0][j] = 0;  // Mark this column
                }
            }
        }

        // STEP 4: Update inner cells based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // STEP 5: Update the first row if required
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // STEP 6: Update the first column if required
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
