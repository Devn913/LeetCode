class Solution {
    HashMap<Integer,List<Integer>> map;
    public Solution(int[] nums) {
        map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            List<Integer> list = map.getOrDefault(nums[i],new ArrayList<Integer>());
            list.add(i);
            map.put(nums[i],list);
        }
    }
    public int pick(int target) {
        List<Integer> list = map.get(target);
        return list.get((int) ((Math.random() * (list.size() - 0)) + 0));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */