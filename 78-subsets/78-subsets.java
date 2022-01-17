class Solution {
    public List<List<Integer>> subsetHelper(int[] nums, int currentIndex){
        List<List<Integer>> list =  new ArrayList<>();
        if(currentIndex==nums.length) return list;
        if(currentIndex == nums.length - 1){
            List<Integer>  temp = new ArrayList<>(1);
            temp.add(nums[currentIndex]);
            list.add(temp);
            List<Integer> temp2 = new ArrayList<>();
            list.add(temp2);
            return list;
            
        }
        list.addAll(subsetHelper(nums,currentIndex+1));
        int size = list.size();
        for(int i = 0;i<size;i++){
            List<Integer> temp = new ArrayList<>(list.get(i));
            temp.add(nums[currentIndex]);
            list.add(temp);
        }
        return list;
    }
    public List<List<Integer>> subsets(int[] nums) {
        return subsetHelper(nums,0);
    }
}