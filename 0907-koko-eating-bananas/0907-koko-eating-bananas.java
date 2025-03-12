class Solution {
    boolean canKokoFinish(int[] piles, int hourLimit, int eatingSpeed){
        int hourTaken = 0;
        for(int num: piles){
            hourTaken += num/eatingSpeed;
            if(num%eatingSpeed!=0) hourTaken++;
            if(hourTaken>hourLimit) return false;
        }
        return true;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int maxSpeed = 1;

        for(int num: piles){
            // minSpeed = Math.min(num,minSpeed);
            maxSpeed = Math.max(num,maxSpeed);
        }
        int ans = maxSpeed;
        int low = 1;
        int high = maxSpeed;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canKokoFinish(piles,h,mid)){
                ans  = Math.min(ans,mid);
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return ans;
        
    }
}