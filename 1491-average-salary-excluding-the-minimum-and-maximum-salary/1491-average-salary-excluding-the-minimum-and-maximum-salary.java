class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max  = Integer.MIN_VALUE;
        for(int val: salary){
            if(val>max)
                max = val;
            if(val<min)
                min = val;
        }
        double ans = 0;
        for(int val: salary){
            if(val == min || val == max)
                continue;
            ans+=val;
        }
        ans = ans/(salary.length-2);
        return ans;
    }
}