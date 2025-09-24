// https://leetcode.com/problems/valid-perfect-square/

package LeetCode;

public class leetcode_Q367 {
    public static void main(String[] args) {
        int num = 808201;
        boolean res = isPerfectSquare(num);
        System.out.println(res);
    }
     static boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }
        int start = 0;
        int end = num/2;
       while(start <= end){
        int mid = start + (end - start) / 2;
        long res = (long)mid * mid;
        if(res == num){
            return true;
        }else if(res < num){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
       } 
       return false;
     }
}