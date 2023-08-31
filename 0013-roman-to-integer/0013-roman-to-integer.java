class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == 'I'){
                if(i+1!=s.length()){
                    if(s.charAt(i+1)=='V'){
                        i = i+1;
                        ans+=4;
                    }else if(s.charAt(i+1) == 'X'){
                        i = i+1;
                        ans+=9;
                    }else ans+=1;
                }
                else ans+=1;
            }else if(s.charAt(i)=='V') ans+=5;
            else if(s.charAt(i)=='X'){
                if(i+1!=s.length()){
                    if(s.charAt(i+1)=='L'){
                        i = i+1;
                        ans+=40;
                    }else if(s.charAt(i+1) == 'C'){
                        i= i+1;
                        ans+=90;
                    } else ans+=10;
                }
                else ans+=10;
            }else if(s.charAt(i)=='L') ans+=50;
            else if(s.charAt(i) == 'C'){
                if(i+1!=s.length()){
                    if(s.charAt(i+1)=='D'){
                        i+=1;
                        ans+=400;
                    }else if(s.charAt(i+1)=='M'){
                        i+=1;
                        ans+=900;
                    }else ans+=100;
                }else ans+=100;
                
            }else if(s.charAt(i) == 'D') ans+=500;
            else ans+=1000;
        }
        return ans;
    }
}