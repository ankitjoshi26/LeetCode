package LeetCode;

public class leetcode_Q925 {
    public static void main(String[] args) {
        String name = "anku";
        String typed = "ankkuuuuuuuuu";
        System.out.println(isLongPressedName(name,typed));
        // printf();
    }
    static boolean isLongPressedName(String name, String typed){
        int i=0, n = name.length(), m = typed.length();

        for(int j=0;j<m;j++){

            if(i<n && name.charAt(i) == typed.charAt(j)){
                i++;
            }
            else if(j==0 || typed.charAt(i) != typed.charAt(j-1)){
                return false;
            }

        }
        return i==n;
    }
}
