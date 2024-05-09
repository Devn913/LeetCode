class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int ele: happiness){
            pq.add(ele);
        }
        long ans = 0;
        for(int i = 0;i<k;i++){
           ans+=Math.max(pq.poll()-i,0); 
        }
        return ans;
    }
}