class Solution {
    public int maxDistToClosest(int[] seats) {
        int start = Integer.MIN_VALUE;
        int end = Integer.MAX_VALUE;
        int ans = 0;
        int len = seats.length;
        for(int i = 0;i<len;i++){
            if(seats[i] == 0){
                start = i;
                end = start+1;
                while(end<len){
                    if(seats[end] == 1) break;
                    end++;
                }
                if(end>=len || start == 0) ans = Math.max(ans,end-start);
                else if((end-start)%2==0) ans = Math.max(ans,(end - start)/2);
                else ans = Math.max(ans,(end - start +1)/2);
                i = end;
            }
        }
        return ans;
    }
}