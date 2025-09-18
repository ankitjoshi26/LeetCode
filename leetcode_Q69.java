// https://leetcode.com/problems/sqrtx/

package LeetCode;

public class leetcode_Q69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
     static int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int start = 1;
        int end = x/2;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int ans = mid * mid;
            if(ans == x){
                return mid;
            }else if (ans < x) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
      }
       return end;
   }
}