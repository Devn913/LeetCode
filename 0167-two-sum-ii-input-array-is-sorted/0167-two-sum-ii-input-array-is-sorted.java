class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while(low<high){
            int sum = numbers[low]+numbers[high];
            if(sum == target) break;
            else if(sum>target) high--;
            else low++;
        }
        int[] ans = {low+1,high+1};
        return ans;
    }
}