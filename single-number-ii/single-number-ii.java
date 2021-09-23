class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        int counter = 1;
        if(nums[1]!=nums[0]) return nums[0];
        else if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
        else{
            while(counter<nums.length){
                if(!(nums[counter-1] == nums[counter])){
                    return nums[counter-1];
                }
                counter = counter + 3;
            }
        }
        return counter-1;
    }
}