// https://leetcode.com/problems/power-of-three/

package LeetCode;

public class leetcode_Q326 {
    public static void main(String[] args) {
        System.out.println(find(27));
    }
    static boolean find(int n){
        if(n < 1){
            return false;
        }
        else if(n == 1){
            return true;
        }else{
            while(n % 3 == 0){
                n = n / 3;
            }
        if(n == 1){
            return true;
        }else{
            return false;
        }
        }
    }
}
