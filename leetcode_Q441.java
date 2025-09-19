package LeetCode;

public class leetcode_Q441 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(arrangeCoins(7));
    }
    static int arrangeCoins(int n){
       long start = 1;
       long end = n;   
       
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long coins = mid * (mid + 1) / 2;
            
            if (coins == n) {
                return (int) mid; // perfect fit
            } else if (coins < n) {
                start = mid + 1;  // try bigger rows
            } else {
                end = mid - 1;    // too many coins, reduce
            }
        }
        return (int) end;
    }
}
