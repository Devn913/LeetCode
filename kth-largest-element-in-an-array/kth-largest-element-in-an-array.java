class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(nums.length,Collections.reverseOrder());
        for(int num: nums){
            maxPQ.add(num);
        }
        while(k!=1){
            maxPQ.poll();
            --k;
        }
        return maxPQ.peek();
        
    }
}