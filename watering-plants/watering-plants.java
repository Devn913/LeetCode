class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int max = capacity; 
        for(int i =0;i<plants.length;i++){
            if(capacity>=plants[i]){
                capacity-=plants[i];
                plants[i] = 0;
                steps++;
                
            }else{
                steps+=(2*i);
                capacity = max;
                --i;
            }
        }
        return steps;
    }
}