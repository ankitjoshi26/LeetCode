package LeetCode;

public class leetcode_Q168 {
    public static void main(String[] args) {
        int columnNumber = 28;
        System.out.println(convertToTitle(columnNumber));
    }
    static String convertToTitle(int columnNumber){
        StringBuilder result = new StringBuilder();    // store answer 
        while (columnNumber > 0) {    // works when columnNumber is greater then 0.
            columnNumber --;         // decrease columnNumber by 1.
            result.insert(0, (char)((columnNumber % 26) + 'A'));  // columnNumber divided by 26. after dividing the value is added with value of 'A'. after this it is coverted to character by using (char) and stored in 0 (index) everytime.
            columnNumber /= 26;  // for updating value of columnNumber (dividing by 26).
        }
        return result.toString();  // return stored result (covert StringBuilder to String).
    }
}