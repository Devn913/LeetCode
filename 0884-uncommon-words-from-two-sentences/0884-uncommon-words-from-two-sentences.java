class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashSet<String> ignore = new HashSet<>();
        HashSet<String> ans = new HashSet<>();
        String[] list1 = s1.split(" ");
        for(String word: list1){
            if(ignore.contains(word)) continue;
            if(ans.contains(word)){
                ans.remove(word);
                ignore.add(word);
                continue;
            }
            ans.add(word);
        }
        String[] list2 = s2.split(" ");
        for(String word: list2){
            if(ignore.contains(word)) continue;
            if(ans.contains(word)){
                ans.remove(word);
                ignore.add(word);
                continue;
            }
            ans.add(word);
        }
        int n = ans.size(); 
        String arr[] = new String[n]; 
  
        int i = 0; 
        for (String x :ans) 
            arr[i++] = x;
        return arr;
        
    }
}