class Solution {
    public List<Integer> subarraySum(int[] nums){
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int j = 0;j<nums.length;j++){
            sum = 0;
            for(int i = j;i<nums.length;i++){
                sum+=nums[i];
                list.add(sum);
            }
        }
        return list;
        
    }
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> list = subarraySum(nums);
        Collections.sort(list);
        long ans = 0;
        int mod =(int) 1e9+7;
        for(int i = left-1;i<right;i++){
            ans= (ans + list.get(i))%mod;
        }
        return (int) ans;

    }
}