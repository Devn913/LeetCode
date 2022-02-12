class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        for(int i = 0;i<gas.length;i++){
            total+=gas[i];
            total-=cost[i];
        }
        if(total<0) return -1;
        int start = -1;
        int currentGas = 0;
        for(int i = 0;i<gas.length;i++){
            currentGas = currentGas + gas[i] - cost[i];
            if(currentGas>=0 && start == -1) start = i;
            else if(currentGas<0){
                currentGas =0;
                start = -1;
            }
        }
        return start;
    }
}