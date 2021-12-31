class Solution {
    public int maxIceCream(int[] costs, int coins) {
        /*Arrays.sort(costs);
        int counter = 0;
        for(int num: costs){
            if(coins>=num){
                counter++;
                coins-=num;
            }else break;
        }
        return counter;
        */
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int num: costs) pq.add(num);
        int counter = 0;
        while(!pq.isEmpty()){
            int val = pq.peek();
            if(val>coins) break;
            counter++;
            coins-=val;
            pq.remove();
        }
        return counter;
    }
}