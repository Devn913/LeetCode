class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> ignore = new HashSet<>();
        for(int i = 0;i<words1.length;i++){
            if(ignore.contains(words1[i])) continue;
            if(map.containsKey(words1[i])){
                ignore.add(words1[i]);
                map.remove(words1[i]);
            }else{
                map.put(words1[i],1);
            }
        }
        int ans = 0;
        for(int i = 0;i<words2.length;i++){
            if(ignore.contains(words2[i])) continue;
            int freq = map.getOrDefault(words2[i],0);
            if(freq == 2){
                ignore.add(words2[i]);
                map.remove(words2[i]);
                ans--;
            }else if(freq==1){
                map.put(words2[i],freq+1);
                ans++;
            }
        }
        return ans;
    }
}