class Solution {
    public int countSegments(String s) {
        String[] result = s.split(" ");
        int counter = 0;
        int res=0;
        while(counter<result.length){
            if(!(result[counter].equals(""))){
                res++;
            }
            counter++;
        }
        return res;
    }
}