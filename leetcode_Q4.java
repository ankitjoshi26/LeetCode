package LeetCode;

import java.util.Arrays;

public class leetcode_Q4 {
    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(median(num1,num2));
    }
    static float median(int[] num1, int[] num2){
        int[] newArray = new int[num1.length + num2.length];
        int index = 0;
        for (int i = 0; i < num1.length; i++) {
            newArray[index++] = num1[i];
        }

        // num2 ke elements daalo
        for (int i = 0; i < num2.length; i++) {
            newArray[index++] = num2[i];
        }
        Arrays.sort(newArray);

        // find median

        float median = findMid(newArray);

        return median;
    }
    static float findMid(int[] arr){
       int n = arr.length;
        if (n % 2 == 0) {
            // even length -> average of two middle elements
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0f; // <- note 2.0f for float division
        } else {
            // odd length -> middle element
            return arr[n / 2];
        }
    }
}