class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int zeros = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeros++;
            else swap(nums,i,i-zeros);
        }
    }
}