class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        int i = 0;
        for(i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                sum--;
            }else{
                sum++;
            }
            if(map.containsKey(sum)){
                ans = Math.max(ans,i - map.get(sum));
            }else{
                map.put(sum,i);
            }
            if(sum == 0) ans = i+1;
        }
        return sum == 0 ? i : ans;
    }
}