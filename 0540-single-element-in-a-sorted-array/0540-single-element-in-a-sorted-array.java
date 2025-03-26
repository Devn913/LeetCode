class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        int low = 0;
        int high = nums.length - 1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(mid == 0) return nums[mid];
            else if(nums[mid] == nums[mid+1]){
                if(mid%2 == 0){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }else if(nums[mid] == nums[mid - 1]){
                if(mid%2 == 0){
                    high  = mid - 1;
                }else{
                    low = mid +1;
                }
            }else return nums[mid];
        }
        return nums[low];
    }
}