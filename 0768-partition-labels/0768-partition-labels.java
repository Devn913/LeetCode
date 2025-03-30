class Solution {
    public boolean isValid(int[] freq, int[] allFreq){
        for(int i =0;i<26;i++){
            if(freq[i]!=0 && freq[i] != allFreq[i]  ) return false;
            
        }
        return true;
    }
    public List<Integer> partitionLabels(String s) {

        int[] freq = new int[26];
        int[] allFreq = new int[26];
        for(int i = 0; i<s.length();i++){
            allFreq[s.charAt(i) - 'a']++;
        }
        List<Integer> result = new ArrayList<>();
        for(int l= 0, r = 0;r<s.length();r++){
            freq[s.charAt(r)-'a']++;
            boolean flag = isValid(freq,allFreq);
            if(flag){
                result.add(r-l+1);
                l = r+1;
                for(int i = 0;i<26;i++){
                    freq[i] = 0;
                }
            }
        }
        return result;
    }
}