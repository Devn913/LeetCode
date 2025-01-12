class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int sum = numbers[low]+numbers[high];
        while(sum!=target){
    
            if(sum>target){
                high--;
            }else{
                low++;
            }
            sum = numbers[low]+numbers[high];
        }
        int[] ans = {low+1,high+1};
        return ans;
    }
}