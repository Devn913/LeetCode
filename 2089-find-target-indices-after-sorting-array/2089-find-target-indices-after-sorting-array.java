class Solution {
    public List<Integer> targetIndicesHelper(int[] nums, int low, int high, int target){
        List<Integer> list = new ArrayList<>();
        if(low>high) return list;
        int mid = (low+high)/2;
        if(mid!=low && nums[low]<= target && nums[mid-1]>=target) list.addAll(targetIndicesHelper(nums,low,mid - 1,target));
        if(nums[mid] == target) list.add(mid);
        if(mid!= high && nums[mid+1]<=target && nums[high] >=target) list.addAll(targetIndicesHelper(nums,mid+1,high,target));
        return list;
    } 
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        return targetIndicesHelper(nums,0,nums.length-1,target);
    }
}