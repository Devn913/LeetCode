class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res =0;
        int counter = 0;
        if(ruleKey.equals("name")) counter= 2;
        else if(ruleKey.length() == 5) counter = 1;
        for(int i = 0;i<items.size();i++){
            if((items.get(i).get(counter)).equals(ruleValue)) res++;
        }
        return res;
    }
}