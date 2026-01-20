package LeetCode;

import java.util.Arrays;

public class leetcode_Q832 {
    public static void main(String[] args) {
        int[][] input = {{1,1,0}, {1,0,1}, {0,0,0}};
        System.out.println(flipAndInvertImage(input));
    }
    static int[][] flipAndInvertImage(int[][] image){
        for(int[] row : image){
            for(int i = 0; i < (image[0].length + 1) / 2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
