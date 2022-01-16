class Solution {
    public int maxDistToClosest(int[] seats) {
        int start = Integer.MIN_VALUE;
        int end = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0;i<seats.length;i++){
            if(seats[i] == 0){
                start = i;
                end = start;
                while(end<seats.length){
                    if(seats[end] == 1) break;
                    end++;
                }
                if(end>=seats.length) ans = Math.max(ans, end - start);
                else if(start == 0) ans = Math.max(ans,end-start);
                else if((end-start)%2==0){
                    ans = Math.max(ans,(end - start)/2);
                }else{
                    ans = Math.max(ans,(end - start +1)/2);
                }
                i = end;
            }
        }
        return ans;
    }
}