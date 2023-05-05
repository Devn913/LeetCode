class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        for(int i = 0;i<k;i++){
            if(s.charAt(i)=='a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) =='u'){
                ans++;
            }
        }
        int low = 0;
        int high = k;
        int temp = ans;
        while(high!=s.length()){
            if(s.charAt(low)=='a' || s.charAt(low) == 'e'|| s.charAt(low) == 'i' || s.charAt(low) == 'o' || s.charAt(low) =='u'){
                temp--;
            }
            if(s.charAt(high)=='a' || s.charAt(high) == 'e'|| s.charAt(high) == 'i' || s.charAt(high) == 'o' || s.charAt(high) =='u'){
                temp++;
            }
            low++;
            high++;
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}