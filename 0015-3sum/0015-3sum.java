class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set= new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length - 1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                    left++;
                    right--;

                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> list: set){
            result.add(list);
        }
        return result;
    }
}