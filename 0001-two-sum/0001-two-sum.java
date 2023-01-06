class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int result[] = new int[2];
        for(int i = 0;i<nums.length;i++){
            int index = map.getOrDefault(target - nums[i],-1);
            if(index!=-1 && index!=i){
                result[0] = i;
                result[1] = index;
                break;
            }
        }
        return result;
    }
}