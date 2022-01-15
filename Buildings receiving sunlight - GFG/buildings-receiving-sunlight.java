// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n+5];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.longest(arr, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java



class Solution {

    public static int longest(int arr[],int n)
    {
        int maxTillNow = 0;
        int res = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]>= maxTillNow) {
                res++;
                maxTillNow = arr[i];
            }
        }
        return res;
    }
}
