class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        if(len==1) return nums[0];
        Arrays.sort(nums);
        if(nums[1]!=nums[0]) return nums[0];
        else if(nums[len-1] != nums[len-2]) return nums[len-1];
        else{
            int counter = 1;
            while(counter<len){
                if(!(nums[counter-1] == nums[counter])){
                    return nums[counter-1];
                }
                counter += 3;
            }
        }
        return 0;
    }
}
