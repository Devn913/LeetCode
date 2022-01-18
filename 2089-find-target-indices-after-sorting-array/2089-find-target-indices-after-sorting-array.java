class Solution {
    public List<Integer> targetIndicesHelper(int[] nums, int low, int high, int target){
        List<Integer> list = new ArrayList<>();
        if(low>high) return list;
        if(target < nums[low] || target>nums[high]) return list;
        int mid = (low+high)/2;
        list.addAll(targetIndicesHelper(nums,low,mid - 1,target));
        if(nums[mid] == target) list.add(mid);
        list.addAll(targetIndicesHelper(nums,mid+1,high,target));
        return list;
    } 
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        return targetIndicesHelper(nums,0,nums.length-1,target);
    }
}