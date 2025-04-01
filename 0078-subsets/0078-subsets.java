class Solution {
    public List<List<Integer>> generateSubSet(int[] nums, int currentIndex){
        List<List<Integer>> result = new ArrayList<>();
         System.out.println(currentIndex);
        if(currentIndex == 0){
            List<Integer> list = new ArrayList<>();
            result.add(list);
            return result;
        }
        result = generateSubSet(nums,--currentIndex);
       
        List<List<Integer>> finalResult = new ArrayList<>(result);

        for(int i = 0;i<result.size();i++){
            List<Integer> temp = new ArrayList<>(result.get(i));
            // finalResult.add(temp);
            temp.add(nums[currentIndex]);
            finalResult.add(temp);
        }
        return finalResult;

    }
    public List<List<Integer>> subsets(int[] nums) {
        return generateSubSet(nums,nums.length);
    }
}