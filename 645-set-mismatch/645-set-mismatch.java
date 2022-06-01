class Solution {
    public int[] findErrorNums(int[] nums) {
        int xor = nums[0];
        int[] result = new int[2];
        int sum = 0;
        boolean found = false;
        for(int i = 0;i<nums.length;i++){
            sum+=(Math.abs(nums[i]));
            if(!found){
                int index = Math.abs(nums[i]) -1;
                if(nums[index]<0){
                    result[0] = index+1;
                    found= true;
                }
                nums[index] = -nums[index];
            }
        }
        sum = sum- result[0];
        result[1] = (nums.length+1)*(nums.length)/2 -sum;
        return result;
    }
}