class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 
    public int[] applyOperations(int[] nums) {
        if(nums.length == 1) return nums;
        for(int i = 0;i<nums.length - 1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = 2*nums[i];
                nums[i+1] = 0;
                i++;
            }
        }
        
        int indexToSwap = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0)     {
                swap(nums,i,indexToSwap);
                indexToSwap++;
  
            }        
 
        }
        return nums;
    }
}