// { Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Solution g = new Solution();
			
			    if(g.isSumTree(root) == true)
    			    System.out.println(1);
    			else 
    			    System.out.println(0);
                t--;
            
        }
    }
  
}

// } Driver Code Ends


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    class pair{
        boolean isSumTree;
        int sum;
        boolean isNull;
        pair(boolean isSumTree, int sum,boolean isNull){
            this.isSumTree = isSumTree;
            this.sum = sum;
            this.isNull = isNull;
        }
    }
    pair helper(Node root){
        if(root == null){
            return new pair(true,0,true);
        }
        pair left = helper(root.left);
        pair right = helper(root.right);
        if(left.isSumTree && right.isSumTree){
            if(left.isNull && right.isNull) return new pair(true,root.data,false);
            else if(root.data == left.sum + right.sum){
                return new pair(true,root.data+left.sum+right.sum,false);
            }
        }
        return new pair(false,0,false);
    }
	boolean isSumTree(Node root)
	{
	    return helper(root).isSumTree;
	}
}
