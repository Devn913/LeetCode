class Solution {
    public boolean canShip(int[] weight, int cap, int days){
        int currentDays = 1;
        int currentCap = 0;
        for(int num: weight){
            if(currentCap + num > cap ){
                currentDays++;
                currentCap = num;
            }else{
                currentCap+=num;
            }
        }
        return currentDays<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int num: weights){
            low = Math.max(num,low);
            high+=num;
        }

        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
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