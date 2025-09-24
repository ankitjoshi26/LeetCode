// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

package LeetCode;

public class leetcode_Q1351 {
    public static void main(String[] args) {
        int[][] arr = {
                        {4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}
                    };
        
        System.out.println(countNegatives(arr));
    }
    static int countNegatives(int[][] grid) {
     int totalRows = grid.length;
     int totalCols = grid[0].length;
     int row = grid.length - 1;
     int col = 0;
     int count = 0;
     while(row >=0 && col < totalCols){
        if(grid[row][col] < 0){
            count += (totalCols - col);
            row--;
        }else{
            col++;
        }
     }
     return count;
    }
}