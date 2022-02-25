class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        int low = 0;
        int high = nums.length -1;
        if(nums[low]!=nums[low+1]) return nums[low];
        if(nums[high]!=nums[high-1]) return nums[high];
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == nums[mid+1]){
                if((high - mid)%2!=0){
                    high = mid -1;
                }else{
                    low = mid;
                }
            }else if(nums[mid] == nums[mid-1]){
                if((high - mid)%2==0){
                    high = mid;
                }else{
                    low = mid+1;
                }
                
            }else{
                return nums[mid];
            }
        }
        return -1;
    }
}