package LeetCode;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class Leetcode_Q1636 {
    public static void main(String[] args){
        int[] arr = {2,3,1,3,2};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }
    public static int[] frequencySort(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        // count frequency of each num and store the frequency by using HashMap with key,value pair and store that no in Hashset
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            set.add(num);
        }

        // Now convert set to list for sorting bcz we know that sorting is not possible.

        ArrayList<Integer> list = new ArrayList<>(set);

        //  now sort the elements on the basis of frequency low to high:

        Collections.sort(list, (a,b) -> {
            if(freq.get(a) != freq.get(b)){
                // it work as if it returns (-) value than a comes before b and if (+) then a comes after b if (0) then no changes 
                return freq.get(a) - freq.get(b);
            }else{
                return b-a;
            }
        });

        // building resultant Array:

        int index = 0;
        int[] result = new int[arr.length];
        for(int num : list){
            int count = freq.get(num);
            while (count != 0) {
                result[index] = num;
                index++;
                count--;
            }
        }

        return result;
    }
}
