class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));

        int ans = 1;
        int prev_start = intervals[0][0];
        int prev_end   = intervals[0][1];
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0]>=prev_end) {
                ans++;
                prev_start = intervals[i][0];
                prev_end   = intervals[i][1];

            }
            
        }
        return intervals.length - ans;
    }
}