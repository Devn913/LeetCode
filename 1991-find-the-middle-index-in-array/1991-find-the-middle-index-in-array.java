class Solution {
    public int findMiddleIndex(int[] nums) {
        long sum = 0;
        int left[] = new int[nums.length+1];
        int right[] = new int[nums.length+1];
        for(int i = 0;i<nums.length;i++){
            left[i+1] = left[i]+nums[i];
            right[nums.length-i-1] = right[nums.length-i]+nums[nums.length-i-1];
        }

        int index = -1;
        for(int i = 0;i<nums.length;i++){
            if(left[i] == right[i+1]){
                return i;
            }
        }
        return index;
    }
}