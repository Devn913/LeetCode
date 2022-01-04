class Solution {
    public boolean match(String word, String pattern){
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0;i<word.length();i++){
            char s = word.charAt(i);
            char t = pattern.charAt(i);
            if(!map.containsKey(t)){
                map.put(t,s);
            }else if(map.get(t) !=s){
                return false;
            }
        }
        map.clear();
        for(int i = 0;i<word.length();i++){
            char s = word.charAt(i);
            char t = pattern.charAt(i);
            if(!map.containsKey(s)){
                map.put(s,t);
            }else if(map.get(s) !=t){
                return false;
            }
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