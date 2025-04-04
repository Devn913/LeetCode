class Solution {

    public int[][] merge(int[][] intervals) {
        if(intervals.length<2) return intervals;
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        ArrayList<Integer[]> res = new ArrayList<>();
        for(int i = 0;i<intervals.length;i++){
            int start = intervals[i][0];
            int currentEnd = intervals[i][1];
            while(i<intervals.length && intervals[i][0]<=currentEnd){
                currentEnd = Math.max(currentEnd,intervals[i][1]);
                i++;
            }
            Integer[] temp = {start,currentEnd};
            res.add(temp);
            i--;

        }
        int[][] ans = new int[res.size()][2];
        for(int i = 0;i<res.size();i++){
            ans[i][0] = res.get(i)[0];
            ans[i][1] = res.get(i)[1];
        }
        return ans;

    }
}