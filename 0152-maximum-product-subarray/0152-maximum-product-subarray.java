class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int maxTillNow = 1;
        int minTillNow = 1;
        boolean zero = false;
        for(int num: nums){
            if(num == 0){
                maxTillNow = 1;
                minTillNow = 1;
                zero = true;
                continue;
            }
            int temp = num*maxTillNow;
            maxTillNow = Math.max(num,Math.max(num*maxTillNow,num*minTillNow));
            minTillNow = Math.min(num,Math.min(temp,num*minTillNow));
            ans = Math.max(ans,maxTillNow);
        }
        if(zero) ans = Math.max(ans,0);
        return ans;
    }
}