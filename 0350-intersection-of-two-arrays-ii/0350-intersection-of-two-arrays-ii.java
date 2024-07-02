class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num: nums2){
            if(map.getOrDefault(num,0)!=0){
                ans.add(num);
                map.put(num,map.get(num)-1);
            }
        }
                
        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}