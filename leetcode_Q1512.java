// https://leetcode.com/problems/number-of-good-pairs/description/

package LeetCode;

public class leetcode_Q1512 {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {1,2,3,1,1,3};
        System.out.println(goodPairs(arr));
    }
    static int goodPairs(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
}
