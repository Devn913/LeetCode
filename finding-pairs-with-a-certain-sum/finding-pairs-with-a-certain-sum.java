class FindSumPairs {
    int arr1[];
    int arr2[];
    HashMap<Integer, Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        arr1 = nums1;
        arr2 = nums2;
        map = new HashMap<Integer, Integer>();
        for(int num: nums2) map.put(num, map.getOrDefault(num,0)+1);
    }
    
    public void add(int index, int val) {
        map.put(arr2[index],map.getOrDefault(arr2[index],0) - 1);
        arr2[index]+=val;
        map.put(arr2[index],map.getOrDefault(arr2[index],0) + 1);
            
    }
    
    public int count(int tot) {
        int count = 0;
        for(int num: arr1){
            count+=map.getOrDefault(tot-num,0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */