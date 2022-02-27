// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr = new int[n][m];
            
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    arr[i][j] = sc.nextInt ();

    		System.out.println (new Sol().maxOnes (arr, n, m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        int max = 0;
        int maxRow = 0;
        for(int i = 0;i<N;i++){
            int low = 0;
            int high = M -1;
            int ans = -1;
            while(low<=high){
                int mid = (low+high)/2;
                if(Mat[i][mid] == 1){
                    ans = mid;
                    high = mid - 1;
                }else{
                    low = mid+1;
                }
            }
            if(ans!=-1 && max<M-ans){
                max = M - ans;
                maxRow = i;
            }
        }
        return maxRow;
    }
}