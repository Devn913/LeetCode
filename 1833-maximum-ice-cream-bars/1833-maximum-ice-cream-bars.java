class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int max = 0;
        int index = 0;    
        while(costs[index]<=coins){
            max++;
            coins-=costs[index];
            index++;
            if(index==costs.length) break;
        }
        return max;
    }
}