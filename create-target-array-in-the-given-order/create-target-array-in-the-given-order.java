class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result =  new int[nums.length];
        int counter = 0;
        while(counter<nums.length){
            if(counter>index[counter]){
                for(int i = counter;i!=index[counter];i--){
                    result[i] = result[i-1];
                }
                
            }
            result[index[counter]] = nums[counter];
            counter++;
        }
        return result;
    }
}