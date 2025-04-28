class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        map.put(sum,1);
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];

            ans+=map.getOrDefault(sum-k,0);

            map.put(sum,map.getOrDefault(sum,0)+1);


        }
        return ans;
    }
}