class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> set = new HashSet<>();
        for(String word: bannedWords) set.add(word);

        int count = 0;
        for(String word: message){
            if(count == 2) break;
            else if(set.contains(word)) count++;
        }
        return count == 2;
    }
}