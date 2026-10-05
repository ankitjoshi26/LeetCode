public class Leetcode_Q875{
    public static void main(String[] args){
        int[] arr = {3,6,7,11};
        int h = 8;
        System.out.print(minEatingSpeed(arr, h));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;

        for(int pile : piles){
            maxSpeed = Math.max(maxSpeed, pile);
        }

        while(minSpeed < maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;
            if(check(piles, h, mid)){
                maxSpeed = mid;
            }else{
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }
    static boolean check(int[] piles, int h, int speed){
        int hours = 0;
        for(int pile : piles){
            hours += (int)Math.ceil((double) pile/speed);
        }
        return hours <= h;
    }
}