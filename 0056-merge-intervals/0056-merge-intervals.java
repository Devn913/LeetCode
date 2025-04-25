class Solution {
    class Pair{
        int start;
        int end;
        
        Pair(int s, int e){
            this.start = s;
            this.end   = e;
        }
    }
    public int[][] merge(int[][] intervals) {
        if(intervals.length<2) return intervals;
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        ArrayList<Pair> res = new ArrayList<>();
        int i = 0;
        while(i<intervals.length){
            int currStart = intervals[i][0];
            int currEnd       = intervals[i][1];
            i++;
            while(i<intervals.length && currEnd>=intervals[i][0]){

                currEnd = Math.max(intervals[i][1],currEnd);
                i++;
            }
            res.add(new Pair(currStart,currEnd));
        }

        int[][] ans = new int[res.size()][2];
        for(int j = 0;j<ans.length;j++){
            ans[j][0] = res.get(j).start;
            ans[j][1] = res.get(j).end;
        }
        return ans;
    }
}