class Solution {
    public void swap(int[] arr, int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        k = n-k;
        int[] arr =  new int[k];
        int i = 0;
        for(;i<k;i++) arr[i] = nums[i];
        i=0;
        for(;i<n - k ;i++){
            swap(nums,i,i+k);
        }
        for(int num: arr){
            nums[i] = num;
            i++;
        }
        
    }
}