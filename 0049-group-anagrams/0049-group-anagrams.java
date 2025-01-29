class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String w = new String(word);
            if(map.containsKey(w)){
                map.get(w).add(strs[i]);
            }else{
                List<String> lis = new ArrayList<>();
                lis.add(strs[i]);
                map.put(w,lis);
            }
        }
        List<List<String>> ans = new ArrayList<>(map.values());
        return ans;
    }
}