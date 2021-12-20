class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String str: cpdomains){
            String[] words = str.trim().split("[ .]+");
		    int value = Integer.parseInt(words[0]);
		    String domain = "";
            for(int i = words.length-1;i>0;i--){
                domain = words[i] + domain;
                map.put(domain, map.getOrDefault(domain,0)+value);
                domain = "." + domain;
            }
        }
        List<String> list = new ArrayList<String>(map.size());
        for (Map.Entry<String, Integer> set : map.entrySet()) {
            list.add(Integer.toString(set.getValue())+ " "+ set.getKey());
        }
        return list;
        
    }
}