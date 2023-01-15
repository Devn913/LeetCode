class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = s.length()-1;i!=-1;i--){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }
        }
        int begin = 0;
        int end = map.get(s.charAt(0));
        ArrayList<Integer> list = new ArrayList<>();
        while(begin!=s.length()){
            end = map.get(s.charAt(begin));
            int temp = begin;
            while(temp!=end){
                int nextCharEnd = map.get(s.charAt(temp));
                if(nextCharEnd>end){
                    end = nextCharEnd;
                }
                if(end ==s.length()-1 ) break;
                temp++;
            }
            list.add(end-begin+1);
            begin = end+1;
        }
        return list;
    }
}