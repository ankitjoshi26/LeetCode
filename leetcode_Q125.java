// https://leetcode.com/problems/valid-palindrome/

package LeetCode;

public class leetcode_Q125 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase().replaceAll("[^a-z0-9]", ""); // here ^ operator work as NOT -> jo a–z ya 0–9 nahi hai unhe replace kr do.
        int i = 0;
        int j = str.length()-1;
        while (i<=j) {
            
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}