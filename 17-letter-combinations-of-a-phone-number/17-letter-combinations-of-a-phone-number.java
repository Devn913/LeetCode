class Solution {
    public List<String> letterHelper(String digit,HashMap<Character,String> map){
        if(digit.equals("")) return new ArrayList<String> (0);
        if(digit.length() == 1){
            List<String> list = new ArrayList<>(3);
            String s = map.get(digit.charAt(0));
            for(int i = 0;i<s.length();i++){
                list.add(String.valueOf(s.charAt(i)));
            }
            return list;
        }
        List<String> list = letterHelper(digit.substring(1,digit.length()),map);
        List<String> result = new ArrayList<>();
        String s = map.get(digit.charAt(0));
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<list.size();j++){
                result.add(String.valueOf(s.charAt(i)).concat(list.get(j)) );
            }
        }
        return result;
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>(8);
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        return letterHelper(digits,map);
    }
}