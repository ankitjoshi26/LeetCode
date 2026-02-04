package LeetCode;

import java.util.Arrays;

public class Leetcode_Q1491 {
    public static void main(String[] args) {
        int[] arr = {4000,3000,1000,2000};
        System.out.println(averageSalary(arr));
    }
    public static double averageSalary(int[] arr){
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 1; i <= arr.length - 2; i++){
            sum += arr[i];
        }
        return sum/(arr.length-2);
    }
}
