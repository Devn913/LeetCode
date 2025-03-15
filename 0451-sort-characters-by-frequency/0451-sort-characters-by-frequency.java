class Solution {
    public String frequencySort(String s) {
        if(s.length()<3) return s;
        int[] freq = new int[256];
        for(int i = 0;i<s.length();i++){
            freq[(int)s.charAt(i)]++;
        }

        TreeMap<Integer, List<Character>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                sortedMap.putIfAbsent(freq[i], new ArrayList<>());
                sortedMap.get(freq[i]).add((char) i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, List<Character>> entry : sortedMap.entrySet()) {
            int frequency = entry.getKey();
            List<Character> characters = entry.getValue();
            for (char c : characters) {
                for (int i = 0; i < frequency; i++) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}