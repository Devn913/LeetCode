class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int index = 0;

        while(index<s.length()){
            char c = s.charAt(index);
            if(c == 'I'){
                if(index+1<s.length()){
                    if(s.charAt(index+1) == 'V'){
                        ans+=4;
                        index+=2;
                    }else if(s.charAt(index+1) == 'X'){
                        ans+=9;
                        index+=2;
                    }else {
                        ans+=1;
                        index+=1;
                    }
                }else{
                    ans+=1;
                    index+=1;
                }
            }else if(c== 'V'){
                ans+=5;
                index++;

            }else if(c == 'X'){
                if(index+1<s.length()){
                    if(s.charAt(index+1) == 'L'){
                        ans+=40;
                        index+=2;
                    }else if(s.charAt(index+1) == 'C'){
                        ans+=90;
                        index+=2;
                    }else {
                        ans+=10;
                        index+=1;
                    }
                }else{
                    ans+=10;
                    index+=1;
                }

            }else if(c == 'L'){
                ans+=50;
                index++;
                
            }else if(c == 'C'){
                if(index+1<s.length()){
                    if(s.charAt(index+1) == 'D'){
                        ans+=400;
                        index+=2;
                    }else if(s.charAt(index+1) == 'M'){
                        ans+=900;
                        index+=2;
                    }else {
                        ans+=100;
                        index+=1;
                    }
                }else{
                    ans+=100;
                    index+=1;
                }

            }else if(c == 'D'){
                ans+=500;
                index++;

            }else if(c == 'M'){
                ans+=1000;
                index++;
            }
        }
        return ans;
    }
}