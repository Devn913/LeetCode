class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Optimized;
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);
            if(!map.containsKey(sortedString)){
                ArrayList<String> list = new ArrayList<>();
                map.put(sortedString,list);
            }
            map.get(sortedString).add(strs[i]);
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> list: map.values()){
            result.add(list);
        }
        return result;

    }
}