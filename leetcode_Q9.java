// https://leetcode.com/problems/palindrome-number/

package LeetCode;

public class leetcode_Q9 {
    public static void main(String[] args) {
        System.out.println();
        int num = 121;
        boolean ans = find(num);
        System.out.println(ans);
    }
    static boolean find(int num){
        if(num<0){
            return false;
        }

        int n = num;
        int sum = 0;

        while(n>0){
            int r = n % 10;
            sum = sum*10 + r;
            n = n / 10;
        }

        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }
}