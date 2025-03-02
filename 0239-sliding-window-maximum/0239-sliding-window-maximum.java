class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i = 0;i<k-1;i++){
            tm.put(nums[i],tm.getOrDefault(nums[i],0)+1);
        }
        int[] ans = new int[nums.length - k + 1];
        int start = -1;
        while(start+k<nums.length){
            tm.put(nums[start+k],tm.getOrDefault(nums[start+k],0)+1);
            start++;
            ans[start] = tm.lastKey();
            if(tm.get(nums[start]) == 1) tm.remove(nums[start]);
            else tm.put(nums[start],tm.get(nums[start])-1);
        }
        return ans;
    }
}