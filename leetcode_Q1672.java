// https://leetcode.com/problems/richest-customer-wealth/

package LeetCode;

public class leetcode_Q1672 {
    public static void main(String[] args) {
        System.out.println();
        int[][] arr = {
            {1,2,3},
            {3,2,2}
        };
        int ans = maximumWealth(arr);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
        int min = Integer.MIN_VALUE;
        for(int row = 0; row < accounts.length; row++){
            int sum=0;
            for(int col = 0; col < accounts[row].length; col++){
                sum += accounts[row][col];
            }
            if(sum > min){
                min = sum;
            }
        }
        return min;
    }
}
