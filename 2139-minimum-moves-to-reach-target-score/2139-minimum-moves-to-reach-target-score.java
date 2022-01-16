class Solution {
    public int minMoves(int target, int maxDoubles) {
        int res = 0;
        while(target!=1){
            if(maxDoubles==0) break;
            if(target%2==0){
                target = target/2;
                target++;
                maxDoubles--;
            }
            target--;
            res++;
        }
        return res + target -1;
    }
}