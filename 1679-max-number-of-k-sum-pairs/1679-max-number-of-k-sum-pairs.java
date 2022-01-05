class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums) map.put(num, map.getOrDefault(num,0)+1);
        int res = 0;
        for(int i = 0;i<nums.length - 1;i++){
            int val1 = map.getOrDefault(nums[i],0);
            int val2 = map.getOrDefault(k-nums[i],0);
            if(val1>0 && val2>0){
                if(nums[i] == k - nums[i]){
                    res+=(Math.min(val1,val2)/2);
                }else res+=Math.min(val1,val2);
                map.remove(nums[i]);
                map.remove(k - nums[i]);
               
            }
            
        }
        return res;
    }
}