class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];
        int ans = 1;
        for(int i = nums.length - 1;i!=-1;i--){
            int j = i+1;
            int val = 1;
            while(j<nums.length){
                if(nums[i]<nums[j]) val = Math.max(val,res[j]+1);
                j++;
            }
            res[i] = val;
            ans = Math.max(ans,res[i]);
        }
        return ans;
    }
}