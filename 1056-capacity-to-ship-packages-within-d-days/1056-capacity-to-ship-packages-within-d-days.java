class Solution {
    public boolean canShip(int[] weights, int cap, int days){
        int currentDays = 1;
        int currentWeight= 0;
        for(int num: weights){

            if(currentWeight + num > cap){
                currentDays++;
                currentWeight = num;
            }else {
                currentWeight += num;
            }
            if(currentDays>days) return false;
        }
        return currentDays<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int high = 0;
        int low = 0;
        for(int num: weights){
            low = Math.max(low,num);
            high+=num;
        }
        int ans = high;
        while(low<=high){
            int mid = (low + high)/2;

            if(canShip(weights,mid,days)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}