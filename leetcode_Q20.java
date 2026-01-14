package LeetCode;

import java.util.HashMap;
import java.util.Stack;

import BinarySearch.searchIn2DArray;

public class leetcode_Q20 {
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s){
        Stack <Character> stack = new Stack<>();
        HashMap <Character,Character> mapping = new HashMap<>(); 
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for(char c : s.toCharArray()){
            if(mapping.containsValue(c)){
                stack.push(c);
            }else if(mapping.containsKey(c)){
                if(stack.empty() || mapping.get(c) != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}