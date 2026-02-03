package LeetCode;

import java.util.ArrayList;

public class leetcode_Q17 {
    public static void main(String[] args) {
        mobilePad("", "23");
        System.out.println(mobilePadRet("", "23"));
        System.out.println(mobilePadRetCount("", "23", 0));
    }
    static void mobilePad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '1';
        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            mobilePad(p + ch, up.substring(1));
        }
    }

    // Returning ArrayList:

    static ArrayList<String> mobilePadRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);f
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '1';
        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            ans.addAll(mobilePadRet(p + ch, up.substring(1)));
        }
        return ans;
    }

    static int mobilePadRetCount(String p,String up, int count){
        if(up.isEmpty()){
            return count + 1;
        }

        int digit = up.charAt(0) - '0';
        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            count = (mobilePadRetCount(p + ch, up.substring(1), count));
        }
        return count;
    }
}