class Solution {
    public int minMoves(int target, int maxDoubles) {
        int res = 0;
        while(target!=1){
            if(target%2==0 && maxDoubles!=0){
                target = target/2;
                maxDoubles--;
            }else{
                target--;
            }
            if(maxDoubles==0) return res+target;
            res++;
        }
        return res;
    }
}