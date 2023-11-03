class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int index = 0;
        for(int i = 1;i<=n;i++){
            if(index==target.length) break;
            if(target[index] == i){
                list.add("Push");
                index++;
                continue;
            }
            list.add("Push");
            list.add("Pop");
        }
        return list;
    }
}