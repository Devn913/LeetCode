class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length -1;

        int ans = Integer.MIN_VALUE;
        while(low<high){
            int currHeight = Math.min(height[low],height[high]);
            int width  = high-low;
            ans = Math.max(ans,currHeight*width);

            if(height[low]>height[high]){
                high--;
            } else{
                low++;
            }
        }
        return ans;
    }
}