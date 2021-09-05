class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int result = 0;
        int counter1=-1;
        int counter2  =-1;;
        if(s1.length() != s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        for(int i = 0;i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                result++;
                if(counter1==-1){
                    counter1 = i;
                }else{
                    counter2 =i;
                }
            }
            if(result > 2){
                return false;
            }
        }
        if(result==2 && s1.charAt(counter1) == s2.charAt(counter2) && s1.charAt(counter2) == s2.charAt(counter1)){
            return true;
        }
        return false;
        
        
    }
}