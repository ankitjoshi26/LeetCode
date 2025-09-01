// https://leetcode.com/problems/power-of-two/

package LeetCode;

public class leetcode_Q231 {
    public static void main(String[] args) {
        System.out.println();
        int target = 12;
        // int num = 2;
        System.out.println(find(target));
    }
    static boolean find(int n){
         if(n < 1){
            return false;
         }else if(n == 1){
            return true;
         }else{
            while(n % 2 == 0){
                n = n / 2;
            }
            if(n == 1){
                return true;
            }
            else{
                return false;
            }
         }
    }
}