class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int currentIndex = s.length()-1;
        while(currentIndex!=-1){
            if(s.charAt(currentIndex)!='*'){
                sb.append(s.charAt(currentIndex));
                currentIndex--;
            }else{
                int toRemove = 0;
                while(currentIndex!=-1){
                    if(s.charAt(currentIndex)=='*'){
                        toRemove++;
                    }else{
                        toRemove--;
                    }
                    currentIndex--;
                    if(toRemove==0) break;
                }
            }
        }
        return sb.reverse().toString();
    }
}