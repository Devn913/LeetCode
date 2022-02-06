class Solution {
    public long smallestNumber(long num) {
        if(num==0) return 0;
        boolean negative = false;
        if(num<0) {
            negative = true;
            num = -num;
        }
        List<Integer> list = new ArrayList<>(15);
        int zeros = 0;
        while(num!=0){
            long digit = num%10;
            if(digit==0){
                zeros++;
            }else{
                list.add((int)digit);
            }
            num = num/10;
            
        }
        Collections.sort(list);
        if(!negative){
            num = list.get(0);
            while(zeros!=0){
                num = num*10;
                zeros--;
            }
            for(int i = 1;i<list.size();i++){
                num = num*10+list.get(i);
            }
        }else{
            for(int i = list.size()-1;i!=-1;i--){
                num = num*10+list.get(i);
            }
            
            while(zeros!=0){
                num = num*10;
                zeros--;
            }
            num = - num;
        }
        return num;
    }
}