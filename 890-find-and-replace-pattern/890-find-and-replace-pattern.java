class Solution {
    public boolean match(String word, String pattern){
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map1 = new HashMap<>();
        for(int i = 0;i<word.length();i++){
            char s = word.charAt(i);
            char t = pattern.charAt(i);
            if(!map.containsKey(s)) map.put(s,t);
            if(!map1.containsKey(t)) map1.put(t,s);
            if(map.get(s) !=t || map1.get(t)!=s) return false;
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(String word : words){
            if(match(word,pattern)) list.add(word);
        }
        return list;
    }
}