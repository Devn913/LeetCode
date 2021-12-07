class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>();
        for(int num: nums){
            maxPQ.add(num);        
            if(maxPQ.size() > k) {
                maxPQ.poll();
            }
        }
        return maxPQ.peek();
        
    }
}