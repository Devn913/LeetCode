class Solution {
    private int binarySearch(int[] arr, int start, int element){
        int low = start;
        int high = arr.length -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==element){
                return mid;
            }else if(arr[mid]>element){
                high = mid-1;                
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    public int findPairs(int[] nums, int k) {
        HashSet<Pair<Integer,Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            int res = binarySearch(nums,i+1,nums[i]+k);
            if(res!=-1){
                set.add(new Pair<Integer,Integer>(nums[i],nums[i]+k));
            }
        }
        return set.size();
    }
}