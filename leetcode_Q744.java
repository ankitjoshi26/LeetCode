// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

package LeetCode;

public class leetcode_Q744 {
    public static void main(String[] args) {
        char[] arr = { 'c', 'j', 'f'};
        System.out.println(find(arr, 'a'));
    }
    static char find(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
         
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start %  letters.length];
    }
}
