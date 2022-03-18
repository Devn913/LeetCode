class Solution {
    public String removeDuplicateLetters(String s) {
        if(s.length()<2) return s;
        boolean[] exist = new boolean[26];
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for(int i = 0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }
        int size = 0;
        int i = 0;
        while(i<s.length()){
            if(size == 0){
                sb.append(s.charAt(i));
                exist[s.charAt(i) - 'a'] = true;
                freq[s.charAt(i) - 'a']--;
                size++;
                i++;
                continue;
            }
            if(!exist[s.charAt(i) - 'a']){
                if(sb.charAt(size-1)<s.charAt(i)){
                    sb.append(s.charAt(i));
                    size++;
                    freq[s.charAt(i) - 'a']--;
                    exist[s.charAt(i) - 'a'] = true;
                }else{
                    if(freq[sb.charAt(size - 1)-'a']>=1){
                        exist[sb.charAt(size-1) - 'a'] = false;
                        sb.deleteCharAt(size - 1);
                        size--;
                        continue;
                        
                    }else{
                        sb.append(s.charAt(i));
                        size++;
                        freq[s.charAt(i) - 'a']--;
                        exist[s.charAt(i) - 'a'] = true;

                    }
                }
            }else {
                freq[s.charAt(i) - 'a']--;
                
            }
            i++;
                
        }
        return sb.toString();
    } 
}