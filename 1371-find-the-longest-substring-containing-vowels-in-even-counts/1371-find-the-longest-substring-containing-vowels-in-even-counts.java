class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        int ans = 0;
        int[] characterMap = new int[26];
        characterMap['a' - 'a'] = 1;
        characterMap['e' - 'a'] = 2;
        characterMap['i' - 'a'] = 4;
        characterMap['o' - 'a'] = 8;
        characterMap['u' - 'a'] = 16;
        for(int i = 0;i<s.length();i++){
            xor = xor ^ characterMap[s.charAt(i) - 'a'];
            if(xor == 0) ans = i+1;
            if(map.containsKey(xor)) ans = Math.max(ans,i-map.get(xor));
            if(!map.containsKey(xor)) map.put(xor,i);
        }
        return ans;
    }
}