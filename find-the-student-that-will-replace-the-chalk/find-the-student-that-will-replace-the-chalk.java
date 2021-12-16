class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int num: chalk) sum+=num;
        if((int)k%(int)sum==0 && k>=sum) return 0;
        else if(k>sum) k = k%(int)sum;
        for(int i=0;i<chalk.length;i++){
            if(k<chalk[i]) return i;
            if(k==chalk[i]) return i+1;
            k-=chalk[i];
        }
        return 0;
    }
}