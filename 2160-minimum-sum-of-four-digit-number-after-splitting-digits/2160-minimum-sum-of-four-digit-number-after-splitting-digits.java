class Solution {
    public int minimumSum(int num) {
        int[] nums = new int[4];
        int i = 0;
        while(num!=0){
            nums[i++] = num%10;
            num = num/10;
        }
        Arrays.sort(nums);
        if(nums[0] == 0 && nums[1]==0 && nums[2] == 0) return nums[3];
        if(nums[0]==0 && nums[1]==0) return nums[2]+nums[3];
        if(nums[0]==0) return nums[1]*10 + nums[2] + nums[3];
        return nums[0]*10+nums[3] + nums[1]*10 + nums[2];
    }
}