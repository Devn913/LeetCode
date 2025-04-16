class Solution {
    public int maxArea(int[] height) {

        // Initilization the two pointer 
        int low  = 0;
        int high = height.length -1;

        int ans = Integer.MIN_VALUE;
        while(low<high){
            // finding the min height for the water level
            int currHeight = Math.min(height[low],height[high]); 

            // finding the width
            int width  = high-low;

            // calculating the area and updating the maximum area
            ans = Math.max(ans,currHeight*width);

            // Changing the pointer which has minimum height
            if(height[low]>height[high]){
                high--;
            } else{
                low++;
            }
        }
        return ans;
    }
}