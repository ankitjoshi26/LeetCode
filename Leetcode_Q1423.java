package LeetCode;


public class Leetcode_Q1423 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(arr, k));
    }

    static int maxScore(int[] cardPoints, int k){
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += cardPoints[i];
        }

        int i = k-1, j = cardPoints.length-1;
        int leftSum = sum, rightSum = 0, currSum = 0, maxSum = sum;

        while(i>=0){
            leftSum -= cardPoints[i];
            rightSum += cardPoints[j];
            currSum = leftSum +  rightSum;
            maxSum = Math.max(maxSum, currSum);
            i--;
            j--;
        }

        return maxSum;
    }
}