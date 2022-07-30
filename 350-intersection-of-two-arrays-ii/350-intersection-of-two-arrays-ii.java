class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num: nums2){
            if(map.containsKey(num)){
                list.add(num);
                map.put(num,map.get(num)-1);
                if(map.get(num) == 0) map.remove(num);
            }
        }
        int[] res = new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i] = list.get(i);
        }
        return res;
    }
}