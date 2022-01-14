class Solution {
    public String frequencySort(String s) {
        if(s.length()<3) return s;
        int freq[][] = new int[122][2];
        StringBuilder sb = new StringBuilder(s.length());
        for(int i = 0;i<122;i++) freq[i][0] = i;
        for(int i = 0;i<s.length();i++){
            int index = s.charAt(i) - '0';
            freq[index][1]++;
        }
        Arrays.sort(freq,(a,b)->Integer.compare(b[1],a[1]));
        int i = 0;
        while(freq[i][1]!=0){
            while(freq[i][1]!=0){
                sb.append((char)(freq[i][0] + '0'));
                freq[i][1]--;
            }
            i++;
        }
        return sb.toString();
    }
}