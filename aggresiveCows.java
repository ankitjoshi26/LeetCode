package LeetCode;

import java.util.Arrays;

public class aggresiveCows {
    public static void main(String[] args) {
        int[] stalls = {1,2,8,4,9};
        int noOfCows = 4;  // no of cows
        System.out.println(corrDistance(stalls,noOfCows));
    }
    static int corrDistance(int[] stalls, int noOfCows){
        Arrays.sort(stalls);
        int minDis = 1;
        int maxDis = stalls[stalls.length - 1] - stalls[0];
        int result = 0;
        while (minDis <= maxDis) {
            int correntDistance = minDis + (maxDis - minDis) / 2;   // mid value = corrent distance

            if (canPlaceCows(stalls,noOfCows, correntDistance)) {  //kya mid value ki distance pe rkhne par sari cows store ho jari hai stalls m ?
                result = correntDistance;  // agar han to result m mid(correntDistance) value store kr do.
                minDis = correntDistance + 1;  // or fr check krlo ish mid value se badi value ki distance m sari cows store ho skti hai kya ?
            }else{     // agar sari cows mid(correntDistance) ki distance se stalls m store ho jari hai. (mtlb kuch cows bach gyi)
                maxDis = correntDistance - 1;  // to distance ko kam krdo
            }
        }
        return result;
    } 
    static boolean canPlaceCows(int[] stalls, int noOfCows, int correntDistance){
        int lastPos = stalls[0]; // first cow ko first position pe rakh dia.
        int count = 1;   // or count ki value 1 krdo kyuki ek cow ko first position pe rkh dia h.

        // checking for remaining cows, kya sari cows stalls ki range m store ho jari hai.
        for(int i=1; i<stalls.length;i++){
            if(stalls[i] - lastPos >= correntDistance){  //agar jaha pe hum abhi hai(i) ush main se last position hai jo cow (lastPos) ki ushko minus krenge or agar wo correntDistance(mid value) se (>) badi or equal(=)hoti hai to 
                count++; // to count ki value ko bada denge (mtlb ek cow or store ho gyi)
                lastPos = stalls[i]; // or last position ko update krdo

                if(count == noOfCows) { // sari cows store ho gyi to true return krdo
                    return true;
                }
            }
        }
    return false;  // agar sari cows store nhi ho payi to false return krdo.
    }
}