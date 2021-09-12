class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        if(target<nums[low] || target>nums[high]){
            return -1;
        }
        while(low<=high){
            mid = (low+high)/2;
            if(nums[low] == target){
                return low;
            } else if(nums[high] == target){
                return high;
            } else if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                high  = mid-1;
                low++;
            } else{
                low = mid+1;
                high--;
            }
        }
        return -1;
    }
}