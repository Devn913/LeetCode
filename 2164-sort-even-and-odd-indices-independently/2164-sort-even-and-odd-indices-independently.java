class Solution {
    public int[] sortEvenOdd(int[] nums) {
        if(nums.length<3) return nums;
        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length/2);
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(nums.length/2,  Collections.reverseOrder());
        for(int i = 0;i<nums.length;i+=2){
            pq.add(nums[i]);
            if(i+1!=nums.length) pq1.add(nums[i+1]);
        }
        for(int i = 0;i<nums.length;i+=2){
            nums[i] = pq.remove();
            if(i+1!=nums.length) nums[i+1] = pq1.remove();
        }
        return nums;
    }
}