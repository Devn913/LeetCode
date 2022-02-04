class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0) sum -=1;
            else sum+=1;
            if(sum == 0){
                max = Math.max(max,i+1);
            } else if(map.containsKey(sum)){
                max = Math.max(max,i - map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
}