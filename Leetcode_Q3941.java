package LeetCode;

import java.util.HashSet;

public class Leetcode_Q3941 {
   public static void main(String[] args) {
     String password = "aA1!";
    System.out.println(passwordStrength(password));
   }
 static int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        int sum = 0;
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(set.contains(ch)){
                continue;
            }else{
                set.add(ch);
                if(ch >= 'A' && ch <= 'Z'){
                    sum += 2;
                }
                else if(ch >= 'a' && ch <= 'z'){
                    sum += 1;
                }
                else if(ch >= '0' && ch <= '9'){
                    sum += 3;
                }
                else{
                    sum += 5;
                }
            }
        }
        return sum;
    }
}