class Solution {
    public List<List<Integer>> permute(int[] nums, int startIndex, int endIndex){
        List<List<Integer>> list = new ArrayList<>();
        if(startIndex > nums.length) return list;
        if(startIndex ==  endIndex){
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[startIndex]);
            list.add(temp);
            return list;
        } 
        List<List<Integer>>  temp = permute(nums,startIndex+1,endIndex);
        for(int i = 0;i<temp.size();i++){
            for(int j = 0;j<=temp.get(i).size();j++){
                List<Integer> temp2 = new ArrayList<>();
                temp2.addAll(temp.get(i));
                temp2.add(j,nums[startIndex]);
                list.add(temp2);
            }
        }
        return list;
        
    }
    public List<List<Integer>> permute(int[] nums) {
        return permute(nums,0,nums.length-1);
    }
}