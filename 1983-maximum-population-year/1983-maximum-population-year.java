class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101];
        for(int start =0;start<logs.length;start++){
            for(int i = logs[start][0];i<logs[start][1];i++){
                population[i-1950]++;
            }
        }
        int ans = 0;
        for(int i = 0;i<101;i++){
            if(population[ans]<population[i]) ans = i;
        }
        return ans+1950;
        
     }
}