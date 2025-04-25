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
        if(intervals.length < 2) return intervals;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int index = 0;
        List<Pair> list  = new ArrayList<>();
        while(index<intervals.length){
            int prev_start = intervals[index][0];
            int prev_end   = intervals[index][1];
            index++;
            while(index<intervals.length && prev_end>=intervals[index][0]){
                prev_end = Math.max(prev_end,intervals[index][1]);
                index++;
            }

            list.add(new Pair(prev_start,prev_end));
        }
        int[][] result = new int[list.size()][2];
        for(int i = 0;i<result.length;i++){
            result[i][0] = list.get(i).start;
            result[i][1] = list.get(i).end;
        }
        return result;

    }
}