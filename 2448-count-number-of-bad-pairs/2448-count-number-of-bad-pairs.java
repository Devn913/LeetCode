class Solution {
    public long countBadPairs(int[] nums) {
        long ans =(long) (nums.length)*(nums.length-1)/2;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int temp = map.getOrDefault(nums[i]-i,0);
            ans-= temp;
            map.put(nums[i]-i,temp+1);
        }
        return ans;

    }
}