class Solution {
    public int[] minOperations(String boxes) {
        int[] result =  new int[boxes.length()];
        int smallResult;
        for(int i = 0;i<boxes.length();i++){
            smallResult = 0;
            for(int j = 0;j<boxes.length();j++){
                if(i==j){
                    continue;
                }
                if(boxes.charAt(j) == '1'){
                    if(i-j<0){
                        smallResult  = smallResult + j-i;
                    }else{
                        smallResult = smallResult + i - j;
                    };
                }
                
            }
            result[i]  =smallResult;
            
        }
    return result;
        
    }
}