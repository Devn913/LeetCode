class Solution {
    public long countBadPairs(int[] nums) {
        long ans = 0;
        for(int i = 0;i<nums.length;i++) nums[i] = nums[i] - i;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            ans+=map.getOrDefault(num,0);
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ans = (long) (nums.length)*(nums.length-1)/2 - ans;
        return ans;

    }
}