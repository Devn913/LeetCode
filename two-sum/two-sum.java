class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        int i= 0;
        for(;i<nums.length;i++){
            if(map.containsKey(target-nums[i])   && !(map.get(target-nums[i]) == i)){
                break;
            }
        }
        int[] arr = {i,(int) map.get(target-nums[i])};
        return arr;
    }
}