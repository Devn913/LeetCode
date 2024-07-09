class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currentTime = 1;
        long totalWaitingTime = 0;
        currentTime = customers[0][0];
        for(int i = 0;i<customers.length;i++){
            if(customers[i][0]>currentTime){
                currentTime = customers[i][0];
            }
            totalWaitingTime+=(currentTime+customers[i][1] - customers[i][0]) ;
            currentTime+=customers[i][1];
        }
        return ((1.0)*(totalWaitingTime))/customers.length;
    }
}