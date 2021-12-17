class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int counter = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                i = map.get(c);
                max = Math.max(max,counter);
                counter = 0;
                map.clear();
            }else{
                map.put(c,i);
                counter++;
            }
        }
        return Math.max(counter,max);
        
        
    }
}