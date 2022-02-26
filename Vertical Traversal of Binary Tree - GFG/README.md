# Vertical Traversal of Binary Tree
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a Binary Tree, find the vertical traversal of it starting from the leftmost level to the rightmost level.<br>
If there are multiple nodes passing through a vertical line, then they should be printed as they appear in <strong>level order</strong> traversal of the tree.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
           1
         /   \
       2       3
     /   \   /   \
   4      5 6      7
              \      \
               8      9           
</span><span style="font-size:18px"><strong>Output: </strong>
4 2 1 5 6 3 8 7 9 
<strong>Explanation:</strong></span>
<img alt="" src="https://media.geeksforgeeks.org/img-practice/ScreenShot2021-05-28at3-1622541589.png" class="img-responsive">
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
&nbsp;      </strong>1
 &nbsp; &nbsp;/&nbsp;&nbsp;&nbsp; \
 &nbsp; 2&nbsp; &nbsp; &nbsp;  3
 /&nbsp;&nbsp;  \&nbsp; &nbsp; &nbsp;&nbsp;\
4&nbsp; &nbsp;  &nbsp;5&nbsp; &nbsp;  &nbsp;6
<strong>Output: </strong>4 2 1 5 3 6<strong>
</strong></span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>verticalOrder()&nbsp;</strong>which takes the root node as input parameter and returns an array containing&nbsp;the vertical order traversal of the tree from the leftmost to the rightmost level. If 2 nodes lie in the same vertical level, they should be printed in the order they appear in the level order traversal of the tree.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= Number of nodes &lt;= 3*10<sup>4</sup></span></p>
 <p></p>
            </div>