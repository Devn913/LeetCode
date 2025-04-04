class Solution {
    class Pair{
        int start;
        int end;
        Pair(int start, int end){
            this.start = start;
            this.end   = end;
        }
    }
    public int[][] merge(int[][] intervals) {
        if(intervals.length<2) return intervals;
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        ArrayList<Pair> res = new ArrayList<>();
        int i = 0;
        while(i<intervals.length){
            int start = intervals[i][0];
            int currentEnd = intervals[i][1];
            i++;
            while(i<intervals.length && intervals[i][0]<=currentEnd){
                currentEnd = Math.max(currentEnd,intervals[i][1]);
                i++;
            }
            res.add(new Pair(start,currentEnd));

        }
        int[][] ans = new int[res.size()][2];
        for(i = 0;i<res.size();i++){
            ans[i][0] = res.get(i).start;
            ans[i][1] = res.get(i).end;
        }
        return ans;

    }
}