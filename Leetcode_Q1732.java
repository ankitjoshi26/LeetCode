package LeetCode;

public class Leetcode_Q1732 {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(maxAltitude(arr));
    }
    static int maxAltitude(int[] arr){
        int max = 0;
        int curr = 0;
        for(int value : arr){
            curr = curr + value;
            max = Math.max(max, curr);
        }
        return max;
    }
}
