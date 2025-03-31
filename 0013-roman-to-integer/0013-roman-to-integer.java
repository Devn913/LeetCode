class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'I'){
                if(i+1<s.length()){
                    if(s.charAt(i+1) == 'V'){
                        ans+=4;
                        i++;
                    }else if(s.charAt(i+1) == 'X'){
                        ans+=9;
                        i++;
                    }else{
                        ans++;
                    }
                }else{
                    ans++;
                }
            }else if(c == 'X'){

                if(i+1<s.length()){
                    if(s.charAt(i+1) == 'L'){
                        ans+=40;
                        i++;
                    }else if(s.charAt(i+1) == 'C'){
                        ans+=90;
                        i++;
                    }else{
                        ans+=10;
                    }
                }else{
                    ans+=10;
                }
                

            }else if(c == 'C'){

                
                if(i+1<s.length()){
                    if(s.charAt(i+1) == 'D'){
                        ans+=400;
                        i++;
                    }else if(s.charAt(i+1) == 'M'){
                        ans+=900;
                        i++;
                    }else{
                        ans+=100;
                    }
                }else{
                    ans+=100;
                }

            }
            else if(c == 'V'){
                ans+=5;
            }else if(c == 'L'){
                ans+=50;
            }else if(c ==  'D'){
                ans+=500;
            }else if(c == 'M'){
                ans+=1000;
            }
        }
        return ans;
    }
}