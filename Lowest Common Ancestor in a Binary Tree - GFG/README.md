# Lowest Common Ancestor in a Binary Tree
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif">Given a Binary Tree with all <strong>unique</strong> values and two nodes value,&nbsp;<strong>n1</strong> and <strong>n2</strong>. The task is to find the<strong>&nbsp;lowest common ancestor</strong> of the given two nodes. We may assume that either both n1 and n2 are present in the tree or none of them are&nbsp;present. </span></span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n1 = 2 , n2 = 3  
&nbsp;      1 
&nbsp;     / \ 
&nbsp;    2   3
<strong>Output: </strong><span style="font-family:arial,helvetica,sans-serif">1
</span><strong>Explanation:
</strong></span><span style="font-size:18px">LCA of 2 and 3 is 1.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n1 = 3 , n2 = 4
           5    
      &nbsp;   /    
      &nbsp;  2  
      &nbsp; / \  
      &nbsp;3   4
<strong>Output: </strong><span style="font-family:arial,helvetica,sans-serif">2
</span><strong>Explanation:
</strong>LCA of 3 and 4 is 2.<strong> </strong></span></pre>

<p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Your Task:</strong><br>
You don't have to read, input, or print anything. Your task is to complete the function <strong>lca()&nbsp;</strong>that takes nodes, <strong>n1, and n2</strong> as parameters and returns the&nbsp;<strong>LCA </strong>node as output. Otherwise, return a node with a value of&nbsp;<strong>-1</strong> if both <strong>n1 </strong>and <strong>n2 </strong>are not present in the tree.</span></span></p>

<p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Expected Time Complexity:</strong>O(N).<br>
<strong>Expected Auxiliary Space:</strong>O(Height of Tree).</span></span></p>

<p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Constraints:</strong><br>
1 ≤ Number of nodes ≤ 10<sup>5</sup><br>
1 ≤ Data of a node ≤ 10<sup>5</sup></span></span></p>
 <p></p>
            </div>