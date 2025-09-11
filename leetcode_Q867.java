// https://leetcode.com/problems/transpose-matrix/

package LeetCode;

public class leetcode_Q867 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int result[][] = transpose(arr);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result.length;j++){
                System.out.println(result[i][j]);
            }
        }
    }
    static int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] res = new int[cols][rows];
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
