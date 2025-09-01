// https://leetcode.com/problems/roman-to-integer/

package LeetCode;

import java.util.Scanner;

public class leetcode_Q13 {

    // Function to get integer value of a single Roman character
    public static int valueOf(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Invalid Roman character
        }
    }

    // Function to convert Roman numeral to Integer
    public static int romanToInt(String s) {
        int result = 0;

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            int current = valueOf(s.charAt(i));

            // Check next character if exists
            if (i + 1 < s.length()) {
                int next = valueOf(s.charAt(i + 1));

                // If current < next, we subtract, else we add
                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current; // Last character always added
            }
        }
        return result;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();

        int integer = romanToInt(roman);
        System.out.println("Integer value: " + integer);

        sc.close();
    }
}
