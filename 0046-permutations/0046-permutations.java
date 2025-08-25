class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void helper(int[] nums, int index){
        if(index == nums.length-1){
            List<Integer> list = new ArrayList<>();
            list.add(nums[index]);
            res.add(list);
            return;
        }
        helper(nums, index+1);

        List<List<Integer>> temp_res = new ArrayList<>();
        for(int i = 0;i<res.size();i++){
            List<Integer> arr = res.get(i);
            for(int j = 0;j<=arr.size();j++){
                arr.add(j,nums[index]);
                List<Integer> temp =  new ArrayList<>(arr);
                temp_res.add(temp);
                arr.remove(j);
            }
        }
        res = temp_res;
        return;
    }
    public List<List<Integer>> permute(int[] nums) {
        helper(nums,0);
        return res;
    }
}