class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        for(int num: nums1){
            freq[num]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int num: nums2){
            if(freq[num]!=0){
                list.add(num);
                freq[num]--;
            }
        }
        int[] result =new int[list.size()];
        for(int i = 0;i<list.size();i++) result[i] = list.get(i);
        return result;
    }
}