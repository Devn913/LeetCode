class Solution {
    public int helper(int[] nums, int[] memo, int index,  int exclude){
        if(index== exclude) return 0;
        if(index>=nums.length) return 0;
        if(memo[index]!=-1) return memo[index];

        int currentHouseLoot = nums[index]+ helper(nums, memo, index+2,exclude);
        int notLoot = helper(nums,memo,index+1,exclude);
        memo[index] = Math.max(currentHouseLoot,notLoot);
        return memo[index];

    }

    public int rob(int[] nums) {
        if(nums.length  ==1) return nums[0];

        int[] memo = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            memo[i] = -1;
        }

        int ans1 = helper(nums,memo,0,nums.length -1);
        for(int i = 0;i<nums.length;i++){
            memo[i] = -1;
        }
        int ans2 = helper(nums,memo,1,0);
        return Math.max(ans1,ans2);
    
    }
}