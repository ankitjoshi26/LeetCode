// https://leetcode.com/problems/guess-number-higher-or-lower/

package LeetCode;

public class leetcode_Q374 {
    public static void main(String[] args) {
        int n = 10;
        int x = 6;
        System.out.println();
        System.out.println(guessNumber(n, x));  // we will use API for this
    }
    static int guessNumber(int n,int x) {
        int start = 1;
        int end = n;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if(mid == x){
                return mid;
            }else if(mid < x){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
