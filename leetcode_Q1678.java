// https://leetcode.com/problems/goal-parser-interpretation/

package LeetCode;

public class leetcode_Q1678 {
    public static void main(String[] args) {
        String str = "G()(al)";
        System.out.println(interpret(str));
    }
    static String interpret(String command) {
        String result = "";
        int i = 0;
        while(i<command.length()){
            if(command.startsWith("()", i)){
                result += "o";
                i += 2;
            }else if (command.startsWith("(al)", i)) {
                result += "al";
                i += 4;
            }else{
                result += "G";
                i++;
            }
        }
        return result;
    }
}
