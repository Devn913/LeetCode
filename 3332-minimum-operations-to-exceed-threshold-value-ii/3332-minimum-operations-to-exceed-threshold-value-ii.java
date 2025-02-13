class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for(int num: nums){
            minHeap.add((long) num);
        }
        int numOperations = 0;
        while(minHeap.peek()<k){
            long num1 = minHeap.remove();
            long num2 = minHeap.remove(); 
            minHeap.add(Math.min(num1, num2) * 2 + Math.max(num1, num2));
            numOperations++;
        }
        return numOperations;
    }
}