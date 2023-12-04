class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> nums2Set = new HashSet<>();
        for(int num: nums1){
            nums1Set.add(num);
        }
        for(int num: nums2){
            nums2Set.add(num);
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int num: nums1Set){
            if(!nums2Set.contains(num)){
                list.add(num);
            }
        }
        result.add(list);
        list = new ArrayList<>();
        for(int num: nums2Set){
            if(!nums1Set.contains(num)){
                list.add(num);
            }
        }
        result.add(list);
        return result;

    }
}