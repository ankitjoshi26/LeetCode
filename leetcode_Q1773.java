// https://leetcode.com/problems/count-items-matching-a-rule/

package LeetCode;

import java.util.Arrays;
import java.util.List;

public class leetcode_Q1773 {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
            Arrays.asList("phone", "blue", "pixel"),
            Arrays.asList("computer", "silver", "lenovo"),
            Arrays.asList("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> arr : items){
            if(ruleKey.equals("type") && arr.get(0).equals(ruleValue)){
                count++;
            }
            else if(ruleKey.equals("color") && arr.get(1).equals(ruleValue)){
                count++;
            }
            else if(ruleKey.equals("name") && arr.get(2).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}