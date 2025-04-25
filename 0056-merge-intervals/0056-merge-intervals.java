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

        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        ArrayList<Pair> list = new ArrayList<>();

        int index = 0;
        while(index<intervals.length){
            int currStart = intervals[index][0];
            int currEnd   = intervals[index][1];
            index++;

            while(index<intervals.length && currEnd>=intervals[index][0]){
                currEnd = Math.max(currEnd,intervals[index][1]);
                
                index++;
            }

            list.add(new Pair(currStart,currEnd));

        }
        int[][] res = new int[list.size()][2];
        for(int  i =0;i<res.length;i++){
            res[i][0] = list.get(i).start;
            res[i][1]  = list.get(i).end;
        }
        return res;


    }
}