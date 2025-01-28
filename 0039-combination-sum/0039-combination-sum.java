class Solution {
    public List<List<Integer>> helper(int[] candidates, int startIndex,int target){
        List<List<Integer>> result = new ArrayList<>();
        if(startIndex == candidates.length) return result;
        if(target<0) return result; 
        if(target == candidates[startIndex]){
            List<Integer> temp = new ArrayList<>();
            temp.add(candidates[startIndex]);
            result.add(temp);
            return result;
        }
        result = helper(candidates,startIndex,target-candidates[startIndex]);
        if(result.size()!=0){
            for(int i = 0;i<result.size();i++){
                result.get(i).add(candidates[startIndex]);
            }
        }
        result.addAll(helper(candidates,startIndex+1,target));
        return result;
    }
    

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = helper(candidates,0,target);
        return ans;

    }
}