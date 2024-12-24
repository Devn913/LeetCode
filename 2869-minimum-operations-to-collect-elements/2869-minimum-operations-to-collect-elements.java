class Solution {
    public int minOperations(List<Integer> nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i = nums.size()-1;i!=-1;i--){
            if(set.size()==k) return ans; 
            if(nums.get(i) <= k){
                set.add(nums.get(i));
               
            }
             ans++;
        }
        return ans; 
    }
}