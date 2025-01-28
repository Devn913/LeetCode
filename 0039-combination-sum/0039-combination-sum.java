class Solution {
    // public int binarySearch(int[] arr, int start, int end, int target){
    //     while(start<=end){
    //         int mid = (start+end)/2;
    //         if(arr[mid]==target) return mid;
    //         else if(arr[mid]>target) end = mid - 1;
    //         else start = mid+1;
    //     }
    //     return -1;
    // }
    public List<List<Integer>> helper(int[] candidates, int startIndex,int target){
        if(startIndex == candidates.length) return new ArrayList<>();
        if(target<0) return new ArrayList<>(); 
        if(target == candidates[startIndex]){
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            temp.add(candidates[startIndex]);
            result.add(temp);
            return result;
        }
        List<List<Integer>> result  = helper(candidates,startIndex+1,target);
        List<List<Integer>> result2 = helper(candidates,startIndex,target-candidates[startIndex]);
        if(result2.size()!=0){
            for(int i = 0;i<result2.size();i++){
                result2.get(i).add(candidates[startIndex]);
            }
        }
        result.addAll(result2);
        return result;

    }
    

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = helper(candidates,0,target);
        return ans;

    }
}