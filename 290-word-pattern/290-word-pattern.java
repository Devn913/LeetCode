class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] list = s.split(" ");
        if(list.length!=pattern.length()) return false;
        for(int i = 0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!(map.get(pattern.charAt(i)).equals(list[i]))) return false;
            }else map.put(pattern.charAt(i),list[i]);
        }
        HashMap<String,Character> map1 = new HashMap<>();
        for(int i = 0;i<list.length;i++){
            if(map1.containsKey(list[i]) && map1.get(list[i]) != pattern.charAt(i)) return false;
            else map1.put(list[i],pattern.charAt(i));
        }
        return true;
    }
}