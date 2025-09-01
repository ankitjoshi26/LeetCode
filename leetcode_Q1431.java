package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_Q1431 {

    public static void main(String[] args) {
        System.out.println();
        int[] candies = {2, 3, 5, 1, 2};
        int extraCandies = 3;
        System.out.println(kidWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for (int c : candies) {
            if (c > maxCandies) {
                maxCandies = c;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= maxCandies);
        }
        return result;
    }
}
