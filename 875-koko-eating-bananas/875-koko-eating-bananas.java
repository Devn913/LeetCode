class Solution {
    
    public boolean canEat(int[] piles, int h, int speed){
        int res = 0;
        for(int num: piles) res += (int)Math.ceil(num*1.0/speed);
        return h>=res;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int min = 0;
        for(int num: piles){
            max = Math.max(num,max);
        }
        if(piles.length == h) return max;
        int speed = max;
        while(min<=max){
            int mid = min + (max-min)/2;
            if(canEat(piles,h,mid)){
                speed = mid;
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return speed;
        
    }
}