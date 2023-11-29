class Solution {
    public String reverseVowels(String s) {
        if(s.length()==1) return s;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||
              s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U'){
                list.add(i);
            }
        }
        if(list.size()<=1) return s;
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int low = list.get(index);
        int high = list.get(list.size()-1);
        for(int i = 0;i<s.length();i++){
            if(index!=list.size()){
                low = list.get(index);
                high = list.get(list.size()-1-index);
            }
            if(i!= high){
                sb.append(s.charAt(i));
            }else{
                sb.append(s.charAt(low));
                index++;
            }
        }
        return sb.toString();
    }
}