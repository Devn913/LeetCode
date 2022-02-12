class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int num: nums2){
            while(!s.isEmpty() && s.peek()<num){
                map.put(s.pop(),num);
            }
            s.push(num);
        }
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}