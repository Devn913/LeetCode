class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        int counter = s.length() - 1;
        boolean space  = false;
        while(s.charAt(counter) != ' ' || ! space){
            if(s.charAt(counter) != ' '){
                space = true;
            }
            if(space){result++;}
            counter--;
            if(counter == -1){
                break;
            }
            
        }
        return result;
    }
}