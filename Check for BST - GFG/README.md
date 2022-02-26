# Check for BST
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given the root of a&nbsp;binary tree. Check whether it is a BST or not.<br>
<strong>Note: </strong>We are considering that BSTs can not contain duplicate Nodes.</span><br>
<span style="font-size:18px">A&nbsp;<strong>BST</strong>&nbsp;is defined as follows:</span></p>

<ul>
	<li>
	<div><span style="font-size:18px">The left subtree of a node contains only nodes with keys <strong>less than</strong> the node's key.</span></div>
	</li>
	<li>
	<div><span style="font-size:18px">The right subtree of a node contains only nodes with keys <strong>greater than</strong> the node's key.</span></div>
	</li>
	<li>
	<div><span style="font-size:18px">Both the left and right subtrees must also be binary search trees.</span></div>
	</li>
</ul>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>&nbsp; &nbsp;2
 /&nbsp; &nbsp; \
1&nbsp; &nbsp; &nbsp; 3
<strong>Output: </strong>1 
<strong>Explanation: </strong></span>
<span style="font-size:18px">The left subtree of root node contains node
with key lesser than the root nodes key and 
the right subtree of root node contains node 
with key greater than the root nodes key.
Hence, the tree is a BST.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>  2
&nbsp;  \
&nbsp;   7
&nbsp;    \
&nbsp;     6
&nbsp;      \
&nbsp;       5
&nbsp;        \
&nbsp;         9
&nbsp;          \
&nbsp;           2
&nbsp;            \
&nbsp;             6
<strong>Output: </strong>0 
<strong>Explanation: </strong>
Since the node with value 7 has right subtree 
nodes with keys less than 7, this is not a BST.
</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;</span><span style="font-size:18px"><strong>isBST()</strong> which takes the root of the tree as a parameter and returns <strong>true</strong>&nbsp;if the given binary tree is BST, else returns <strong>false</strong>.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(Height of the BST).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
0 &lt;= Number of edges &lt;= 100000</span></p>
 <p></p>
            </div>