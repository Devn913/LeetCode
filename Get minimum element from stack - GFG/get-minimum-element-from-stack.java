// { Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
    class Node{
        int val;
        int min;
        Node next;
        Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    Node head = null;
    /*returns min element from stack*/
    int getMin()
    {
        if(head ==null) return -1;
        return head.min;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
        if(head == null) return -1;
        int val = head.val;
        head = head.next;
        return val;
    }

    /*push element x into the stack*/
    void push(int x)
    {
        if(head == null){
            head = new Node(x,x,null);
            return;
        }
        Node temp = new Node(x,Math.min(head.min,x),head);
        head=   temp;
    }	
}

