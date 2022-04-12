// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Set<Integer> s =  new HashSet<>();
        Set<Integer> s1 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr){
            if(s1.contains(num)) continue;
            if(s.contains(num)){
              list.add(num);
              s1.add(num);
            } 
            else s.add(num);
        }
        if(list.size()==0) list.add(-1);
        Collections.sort(list);
        return list;
    }
}
