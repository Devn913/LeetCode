class Solution {
    int[] representation = new int[26];
    int find(int x){
        if(x == representation[x]) return x;
        representation[x] = find(representation[x]);
        return representation[x];
    }
    void performUnion(int x, int y){
        x = find(x);
        y = find(y);
        if(x == y) return;
        if(x<y) representation[y] = x;
        else representation[x] = y;
    }
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        for(int i = 0;i<26;i++){
            representation[i] = i;
        }
        for(int i = 0;i<s1.length();i++){
            performUnion(s1.charAt(i)-'a',s2.charAt(i)-'a');
        }
        StringBuilder sb = new StringBuilder(baseStr.length());
        for(int i = 0;i<baseStr.length();i++) sb.append((char) (find(baseStr.charAt(i)-'a')+'a'));
        return sb.toString();
    
    }
}