class Solution {
    
    public List<List<Integer>> combinationSumHelper(int target, int[] candidates, int index){
        List<List<Integer>> list = new ArrayList<>();
        if(target<=0) return list;
        if(index==candidates.length) return list;
        if(candidates[index] == target){
            List<Integer> temp = new ArrayList<>();
            temp.add(target);
            list.add(temp);
            list.addAll(combinationSumHelper(target,candidates,index+1));
            return list;
        }
        for(int i = index;i<candidates.length;i++){
            if(candidates[index] == target){
                List<Integer> temp = new ArrayList<>();
                temp.add(target);
                list.add(temp);
            }else{
                List<List<Integer>> temp = combinationSumHelper(target - candidates[index],candidates,index);
                if(temp.size()!=0){
                    for(List<Integer> temp2: temp){
                        temp2.add(candidates[index]);
                        list.add(temp2);
                    }
                }
            }
            index++;
            
        }
        return list;
    }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return combinationSumHelper(target,candidates,0);
    }
}