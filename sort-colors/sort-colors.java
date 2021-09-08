class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length -1 ;
        int zeros = 0;
        while(i<j){
            if(nums[i] == 0 && nums[j] == 0){
                i++;
                zeros++;
            }else if(nums[i] != 0 && nums[j] == 0){
                swap(nums,i,j);
                i++;
                j--;
                zeros++;
            }else if(nums[i] == 0 && nums[j] != 0){
                i++;
                j--;
                zeros++;
            } else{
                j--;
            }
        }
        i = zeros;
        j = nums.length - 1;
        while(i<j){
            if(nums[i] == 2 && nums[j] == 2){
                j--;
            } else if(nums[i] != 2 && nums[j] == 2){
                i++;
                j--;
            } else if(nums[i] == 2 && nums[j] != 2){
                swap(nums,i,j);
                i++;
                j--;
            } else{
                i++;
            }
        }
    }
}