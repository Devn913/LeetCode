class Solution {
    public String arrangeWords(String text) {
        String[] res = text.split(" ");
        // Arrays.sort(res)
        Arrays.sort(res, (a, b)->Integer.compare(a.length(), b.length()));

        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(res[0].charAt(0)));
        sb.append(res[0].substring(1,res[0].length()));
        for(int i = 1;i<res.length;i++){
            sb.append(" ");
            sb.append(res[i].toLowerCase());
        }
        return sb.toString();
    }
}