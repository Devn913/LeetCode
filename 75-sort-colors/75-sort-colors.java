class Solution { 
    private void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length  -1;
        int current = 0;
        while(current<=right){
            if(nums[current] == 0){
                swap(nums,left,current);
                left++;
                current++;
            }else if(nums[current] == 2){
                swap(nums,right, current);
                right--;
            }else{
                current++;
            }
        }
    }
}