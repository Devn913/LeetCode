class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int count = 0;
        int indexToSwap = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0) count++;
            else{
                swap(nums,i,indexToSwap);
                indexToSwap++;
            }
        }
        return;
        
    }
}