class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i =1;i<nums.length;i++) sum = sum + nums[i];
        int left = 0;
        int counter = 1;
        while(left!=sum && counter<nums.length){
            left += nums[counter-1];
            sum = sum - nums[counter];    
            counter++;
        }
        if(left==sum) return counter-1;
        return -1;
        
    }
}