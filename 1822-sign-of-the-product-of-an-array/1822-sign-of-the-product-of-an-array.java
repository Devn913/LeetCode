class Solution {
    public int arraySign(int[] nums) {
        int ans = 0;
        for(int val: nums){
            if(val==0) return 0;
            else if(val<0) ans++;
        }
        if(ans%2==0) return 1;
        return -1;
    }
}