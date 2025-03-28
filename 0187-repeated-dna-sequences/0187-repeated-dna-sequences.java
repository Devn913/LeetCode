class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if(s.length()<10) return result;
        HashMap<Long,Integer> map = new HashMap<>();
        int MOD                = 1000000000 + 7;
        int P                  = 7;
        int M                  = s.length();
        long d                 = 1;
        long rollingHashValue  = 0;
        for(int i = 0;i<10;i++){
            rollingHashValue = (rollingHashValue * P + (int) s.charAt(i)) % MOD;
            d = (d * P) % MOD;
        }
        
        map.put(rollingHashValue,1);
        for(int i = 0; i+10 < s.length();i++){
        
            rollingHashValue = (rollingHashValue * P + s.charAt(i+10) - s.charAt(i)*d) % MOD;
            if(rollingHashValue<0){
                rollingHashValue+=MOD;
            }
            map.put(rollingHashValue,map.getOrDefault(rollingHashValue,0)+1);
            if(map.getOrDefault(rollingHashValue,0) == 2){ // very less possibility of hash collision hence adding blindly without checking
                result.add(s.substring(i+1,i+11));
            }
        }
        return result;

    }
}