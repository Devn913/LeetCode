class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int removeElement(int[] nums, int val) {
        int number = 0;
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==val) number++;
            else{ swap(nums,i,i-number);res++;}
        }
        return res;
    }
}