package LeetCode;

import java.util.ArrayList;
import java.util.List;

import practice.richestCus;

public class leetcode_Q54 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        System.out.println(spiralOrder(arr));
    }
    static List<Integer> spiralOrder(int[][] matrix) {
          List<Integer> result= new ArrayList<>();
          int n = matrix.length;
          int m = matrix[0].length;
          int startRow = 0;
          int endRow = n - 1;
          int startCol = 0;
          int endCol = m - 1;

          while(startRow <= endRow && startCol <= endCol){

            //first row
            for(int j=startCol; j<=endCol; j++){
                result.add(matrix[startRow][j]);
            }
            startRow += 1;

            //end col
            for(int i=startRow;i<=endRow;i++){
                result.add(matrix[i][endCol]);
            }
            endCol -= 1;

            if(startRow<=endRow){
                //last row
            for(int j=endCol;j>=startCol;j--){
                result.add(matrix[endRow][j]);
            }
            endRow -= 1;
            }

            if(startCol<=endCol){
                //first col
                for(int i=endRow;i>=startRow;i--){
                    result.add(matrix[i][startCol]);
                }
                startCol += 1;
            }
          }
           return result;
    }
}
