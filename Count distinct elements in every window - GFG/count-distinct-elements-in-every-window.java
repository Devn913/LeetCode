// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<k;i++) map.put(A[i],map.getOrDefault(A[i],0)+1);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = k;
        while(j<n){
            list.add(map.size());
            map.put(A[j],map.getOrDefault(A[j],0)+1);
            map.put(A[i],map.get(A[i])-1);
            if(map.get(A[i]) == 0) map.remove(A[i]);
            i++;
            j++;
        }
        list.add(map.size());
        return list;
    }
}

