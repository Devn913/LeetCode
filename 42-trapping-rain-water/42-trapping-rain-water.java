class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n<3) return 0;
        int[] right = new int[n];
        int rightMax = 0;
        for(int i = 0;i<n;i++){
            right[n - i - 1]  = rightMax;
            rightMax = Math.max(height[n- i - 1],rightMax);
        }
        int res = 0;
        int leftMax = 0;
        for(int i = 0;i<n;i++){
            int minHeight = Math.min(leftMax,right[i]);
            if(minHeight>height[i]) res+=(minHeight-height[i]);
            leftMax = Math.max(leftMax,height[i]);
        }
        return res;
    }
}