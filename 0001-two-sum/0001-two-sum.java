class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = {-1,-1};
        for(int i =0;i<nums.length;i++){
            if(map.getOrDefault(target - nums[i],-1)!=-1){
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}