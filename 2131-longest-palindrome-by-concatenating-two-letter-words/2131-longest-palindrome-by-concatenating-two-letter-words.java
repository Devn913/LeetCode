class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        int res = 0;
        int unpaired = 0;
        for(String s: words){
            if(s.charAt(0) == s.charAt(1)){
                if(map.containsKey(s) && map.get(s)>0){
                    unpaired--;
                    res+=4;
                    map.put(s,map.getOrDefault(s,1)-1);
                }else{
                    unpaired++;
                    map.put(s, map.getOrDefault(s,0) + 1);
                }
            }else{
                String rev  = Character.toString(s.charAt(1)) +  Character.toString(s.charAt(0));
                if(map.containsKey(rev) && map.getOrDefault(rev,0) > 0){
                    res+=4;
                    map.put(rev,map.getOrDefault(rev,1) -1);
                }else{
                    map.put(s,map.getOrDefault(s,0)+1);
                }
            }
        }
        if(unpaired>0) res+=2;
        return res;
    }
}