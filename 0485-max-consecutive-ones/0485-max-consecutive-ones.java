class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int maxNo=0;
       int currNo=0;
        for (int i=0; i<nums.length;i++){
            if(nums[i]==1){
                currNo++;
                maxNo = Math.max(currNo,maxNo);
            }
            else{
                currNo=0;
            }

        }
        return maxNo;        
    }
}