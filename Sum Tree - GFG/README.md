# Sum Tree
## Medium 
<div class="problem-statement">
                <p></p><div class="entry-content">
<p><span style="font-size:18px">Given a Binary Tree. Return <strong>true</strong>&nbsp;if, for every node <strong>X</strong>&nbsp;in the tree other than the&nbsp;leaves, its value is equal to the sum of its left subtree's value and its right subtree's value. Else return <strong>false</strong>.</span></p>

<p><span style="font-size:18px">An empty tree is also a Sum Tree as the sum of an empty tree can be considered to be 0. A leaf node is also considered a Sum Tree.</span></p>

<p><br>
<strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
    3
  /   \    
 1     2</span>

<span style="font-size:18px"><strong>Output:</strong> 1</span>
<span style="font-size:18px"><strong>Explanation:
</strong>The sum of left subtree and right subtree is
1 + 2 = 3, which is the value of the root node.
Therefore,the given binary tree is a <strong>sum tree</strong>.</span>
</pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>

<span style="font-size:18px">          10
        /    \
      20      30
    /   \ 
   10    10</span>

<span style="font-size:18px"><strong>Output: </strong>0</span>
<span style="font-size:18px"><strong>Explanation:
</strong>The given tree is not a sum tree.
For the root node, sum of elements
in left subtree is 40 and sum of elements
in right subtree is 30. Root element = 10
which is not equal to 30+40.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp; </strong><br>
You don't need to read input or print anything. Complete the function <strong>isSumTree() </strong>which takes <strong>root </strong>node as input parameter and returns true if the tree is a SumTree else it returns false.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(Height of the Tree</span><span style="font-size:18px">)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ number of nodes ≤ 10<sup>4</sup></span></p>
</div>
 <p></p>
            </div>