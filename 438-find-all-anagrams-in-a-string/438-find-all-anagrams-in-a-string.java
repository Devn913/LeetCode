class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length()<p.length()) return list;
        
        HashMap<Character,Integer> fix = new HashMap<>(p.length());
        for(int i = 0;i<p.length();i++){
            fix.put(p.charAt(i),fix.getOrDefault(p.charAt(i),0)+1);
        }
        int start = 0;
        int end = 0;
        HashMap<Character,Integer> map = new HashMap<>(p.length());
        while(end<p.length() && end<s.length()){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            end++;
        }
        while(end<=s.length()){
            if(map.equals(fix)){
                list.add(start);
            }
            if(map.get(s.charAt(start))>1){
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
            }else{
                map.remove(s.charAt(start));
            }
            if(end<s.length()) map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            end++;
            start++;
        }
        return list;
    }
}