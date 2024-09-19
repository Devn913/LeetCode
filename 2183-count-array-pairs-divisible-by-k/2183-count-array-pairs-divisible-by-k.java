class Solution {
    public long countPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        long ans = 0;
        for(int i =0;i<nums.length;i++){
            int curr_gcd = gcd(nums[i], k);
            for(int num: map.keySet()){
                if((long)curr_gcd*num%k==0)
                    ans+=map.get(num);
            }
            map.put(curr_gcd,map.getOrDefault(curr_gcd,0)+1);
        }
        return ans;
    }
    private int gcd(int x, int y) {
        if (x < y) {
            return gcd(y, x);
        }
        return y == 0 ? x : gcd(y, x % y);
    }
}