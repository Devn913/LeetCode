
class Solution {
    public String removeOccurrences(String s, String part) {
        if(!(s.contains(part))){
           return s;
        }
           return removeOccurrences(s.substring(0,s.indexOf(part)) + s.substring(s.indexOf(part)+part.length(),s.length()),part);
    }
}
