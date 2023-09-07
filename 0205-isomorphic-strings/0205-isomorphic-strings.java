class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }else if(map.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
        }
        map.clear();
        for(int i = 0;i<s.length();i++){
            if(!map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),s.charAt(i));
            }else if(map.get(t.charAt(i))!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}