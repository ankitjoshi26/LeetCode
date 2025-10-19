// https://leetcode.com/problems/defanging-an-ip-address/description/
package LeetCode;

public class leetcode_Q1108 {
    public static void main(String[] args) {
       String s = "1.1.1.1";
       System.out.println(defangIPaddr(s));
    }
    static String defangIPaddr(String address) {
        int length = address.length();
        String newString = "";
        for(int i=0;i<length;i++){
            char ch = address.charAt(i);
            if(ch == '.'){
                newString += "[.]";
            }else{
                newString += ch;
            }
        }
        return newString;
    }
}