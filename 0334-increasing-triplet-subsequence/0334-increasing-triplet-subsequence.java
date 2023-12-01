class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;
        int maxAfterThat[] = new int[nums.length];
        int minBeforeThat[] = new int[nums.length];
        int min ;
        int max;
        max = maxAfterThat[nums.length-1] = nums[nums.length-1];
        min = minBeforeThat[0] = nums[0];
        for(int i = nums.length-2;i!=-1;i--){
            max = Math.max(max,nums[i]);
            maxAfterThat[i] = max;
            min = Math.min(min,nums[nums.length - i-1]);
            minBeforeThat[nums.length-i-1] = min;
        }
        for(int i = 1;i<nums.length-1;i++){
            if(minBeforeThat[i]<nums[i] && nums[i]<maxAfterThat[i]){
                return true;
            }
        }
        return false;
        
    }
}