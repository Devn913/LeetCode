class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points,(a,b)->Double.compare(
            Math.sqrt(a[0]*a[0] +a[1]*a[1]),
            Math.sqrt(b[0]*b[0] +b[1]*b[1])
            ));
        int[][] ans = new int[k][2];
        for(int i = 0;i<k;i++){
            ans[i][0] = points[i][0];
            ans[i][1] = points[i][1];
        }
        return ans;
        
    }
}