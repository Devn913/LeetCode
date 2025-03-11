class Solution {
    public int findPeakElement(int[] nums) {
        int N = nums.length;

        if(N == 1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[N-1]>nums[N-2]) return N-1;

        int low = 1;
        int high = N-2;

        while(low<=high){
            int mid = low + (high - low)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]>nums[mid-1]) low = mid+1;
            else high = mid - 1;

        }
        return -1;
    }
}