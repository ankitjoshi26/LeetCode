// https://leetcode.com/problems/spiral-matrix-ii/description/

package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode_Q59 {
    public static void main(String[] args) {
         int n = 3; // You can change the size of the matrix here
        int[][] result = generateMatrix(n);

        // Printing the matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
          int startRow = 0;
          int endRow = n - 1;
          int startCol = 0;
          int endCol = n - 1;
          int value = 1;
          while(startRow <= endRow && startCol <= endCol){

            //first row
            for(int j=startCol; j<=endCol; j++){
                arr[startRow][j] = value;
                value += 1;
            }
            startRow += 1;

            //end col
            for(int i=startRow;i<=endRow;i++){
                arr[i][endCol] = value;
                value += 1;
            }
            endCol -= 1;

            if(startRow<=endRow){
                //last row
            for(int j=endCol;j>=startCol;j--){
                arr[endRow][j] = value;
                value += 1;
            }
            endRow -= 1;
            }

            if(startCol<=endCol){
                //first col
                for(int i=endRow;i>=startRow;i--){
                    arr[i][startCol] = value;
                    value += 1;
                }
                startCol += 1;
            }
          }
      return arr;
 }
}