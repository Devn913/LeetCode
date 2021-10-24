class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1  =  new HashSet<Integer>();
        for(int num: nums1){
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<Integer>();
        for(int num: nums2){
            set2.add(num);
        }
        set1.retainAll(set2);
        int[] res = new int[set1.size()];
        int i =0;
        for(int num: set1) res[i++]=num;
        return res;

    }
}