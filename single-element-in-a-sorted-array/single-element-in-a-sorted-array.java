class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        if(len==1) return nums[0];
        else if(nums[0] != nums[1]) return nums[0];
        else if(nums[len-1] != nums[len-2]) return nums[len-1];
        else{
            int counter = 1;
            while(counter<len){
                if(nums[counter-1]!=nums[counter]) return nums[counter-1];
                counter+=2;
            }
        }
        return 0;
    }
}