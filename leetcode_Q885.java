// https://leetcode.com/problems/spiral-matrix-iii/description/

package LeetCode;

public class Leetcode_Q885 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int rStart = 1;
        int cStart = 2;

        int[][] result = spiralMatrixIII(rows, cols, rStart, cStart);

        System.out.println("Spiral order coordinates:");
        for(int i = 0; i < result.length; i++){
            System.out.println("[" + result[i][0] + "," + result[i][1] + "]");
        }
    }


    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int direction[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int n = rows*cols;
        int res[][] = new int[n][2];  //[[r,c],[r1,c1]....
        res[0][0] = rStart;
        res[0][1] = cStart;
        int count = 1;
        int step = 1;
        int index = 0;
        while(count<n){
            for(int times = 0;times < 2; times++){
                int dr = direction[index%4][0];
                int dc = direction[index%4][1];
                for(int i=0;i<step;i++){
                    rStart += dr;
                    cStart += dc;
                    if(rStart>=0 && rStart<rows && cStart>=0 && cStart<cols){
                        res[count][0] = rStart;
                        res[count][1] = cStart;
                        count++;
                    }
                }
                index++;
            }
            step++;
        }
        return res;
    }
}
