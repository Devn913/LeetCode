class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> answer = new HashSet<>();
        for(int i = 0;i<nums.length-2;i++){
            int targetSum = -nums[i];

            int low = i+1;
            int high  = nums.length - 1;
            while(low<high){
                int currentSum = nums[low]+nums[high];
                if(targetSum == currentSum){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    answer.add(list);
                    low++;
                    high--;
                }else if(targetSum<currentSum){
                    high--;
                }else{
                    low++;
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> temp: answer){
            result.add(temp);
        }
        return result;
    }
}