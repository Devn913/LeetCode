class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int start = -1;
        for(int i = 0;i<gas.length;i++){
            totalGas = totalGas+gas[i]-cost[i];
            currentGas = currentGas + gas[i]-cost[i];
            if(currentGas<0){
                currentGas = 0;
                start = -1;
                continue;
            }
            if(start==-1) start = i;
            
        }
        if(totalGas<0) start = -1;
        return start;
    }
}