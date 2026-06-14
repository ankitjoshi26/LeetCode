package LeetCode;

public class Leetcode_Q51 {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(board, 0);
    }

    public static void queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return;
        }

        for(int col = 0; col < board.length ;col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                queens(board, row+1);
                board[row][col] = false;
            }
        }
    }

    public static boolean isSafe(boolean[][] board, int row, int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        int left = Math.min(row, col);
        for(int i=1;i<=left;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int right = Math.min(row, board.length-col-1);
        for(int i=1;i<=right;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }


    public static void display(boolean[][] board){
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print(" Q " + "|");
                } else {
                    System.out.print(" X " + "|");
                }
            }
            System.out.println();
        }
    }
}