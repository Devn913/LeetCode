class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = -1;
        int currentGas = 0;
        int total=0;
        for(int i = 0;i<gas.length;i++){
            total = total + gas[i] - cost[i];
            currentGas = currentGas + gas[i] - cost[i];
            if(currentGas<0){
                currentGas = 0;
                start = -1;
                continue;
            }
            if(start == -1) start = i;
        }
        if(total<0) return -1;
        return start;
    }
}