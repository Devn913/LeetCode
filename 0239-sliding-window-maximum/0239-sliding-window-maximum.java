class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[n-k+1];
        int currentIndex = 0;
        for(int i = 0;i<nums.length;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            dq.offerLast(i);
            if(i>=k-1) result[currentIndex++] = nums[dq.peekFirst()];
        }
        return result;
    }
}