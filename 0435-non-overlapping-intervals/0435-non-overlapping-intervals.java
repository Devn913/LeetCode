class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        // Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        
        // for(int i = 0;i<intervals.length;i++){
        //     System.out.println(" ( " + intervals[i][0]+ " " + intervals[i][1] + " ) " );
        // }
        int ans = 1;
        int prev_start = intervals[0][0];
        int prev_end   = intervals[0][1];
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0]>=prev_end) {
                System.out.println(" ( " + intervals[i][0]+ " " + intervals[i][1] + " ) " );
                ans++;
                prev_start = intervals[i][0];
                prev_end   = intervals[i][1];

            }
            
        }
        return intervals.length - ans;
    }
}