class Solution {
    public int maximumPopulation(int[][] logs) {
        int start = Integer.MAX_VALUE;
        int end   = Integer.MIN_VALUE;
        for(int[] entry: logs){
            start = Math.min(start,entry[0]);
            end   = Math.max(end,entry[1]);
        } 
        int[] population = new int[end-start+1];
        for(int[] entry: logs){
            for(int i = entry[0]-start;i<=entry[1]-start-1;i++){
                population[i]++;
            }
        }
        int ans = 0;
        for(int i = 0;i<population.length;i++){
            if(population[ans]<population[i]) ans = i;
        }
        return start+ans;
     }
}