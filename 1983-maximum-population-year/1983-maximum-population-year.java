class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101];
        for(int[] entry: logs){
            for(int i = entry[0];i<entry[1];i++){
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