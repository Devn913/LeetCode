class Solution {
    public int findMinArrowShots(int[][] points) {
        int res = 1;
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int end = points[0][1];
        for(int i = 0;i<points.length;i++){
            if(points[i][0] > end){
                res++;
                end = points[i][1];
            }
        }
        return res;
    }
}