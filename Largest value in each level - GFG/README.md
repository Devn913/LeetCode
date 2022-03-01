# Largest value in each level
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a binary tree, find the largest value in each level.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input :</span></strong>
<span style="font-size:18px">        1
       / \
      2   3 </span>

<span style="font-size:18px"><strong>Output :</strong> 1 3</span>
<strong><span style="font-size:18px">Explanation : </span></strong>
<span style="font-size:18px">There are two levels in the tree :
</span><span style="font-size:18px">1. {1}, max = 1</span>
<span style="font-size:18px">2. {2, 3}, max = 3</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input :</span></strong>
<span style="font-size:18px">        4
       / \
      9   2
     / \   \
    3   5   7 </span>

<span style="font-size:18px"><strong>Output :</strong> 4 9 7</span>
<strong><span style="font-size:18px">Explanation : </span></strong>
<span style="font-size:18px">There are three levels in the tree:</span>
<span style="font-size:18px">1. {4}, max = 4</span>
<span style="font-size:18px">2. {9, 2}, max = 9</span>
<span style="font-size:18px">3. {3, 5, 7}, max=7</span></pre>

<div><strong><span style="font-size:18px">Your task :</span></strong></div>

<div><span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function <strong>largestValues()</strong> which takes the root node of the tree as input and returns a vector containing the largest value in each level.&nbsp;</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Expected Time Complexity :</strong> O(n) , where n = number of nodes</span></div>

<div><span style="font-size:18px"><strong>Expected Auxiliary Space :</strong> O(n) , where n = number of nodes</span></div>

<div>&nbsp;</div>

<div><strong><span style="font-size:18px">Constraints :&nbsp;</span></strong></div>

<div><span style="font-size:18px">1 ≤&nbsp;Number of nodes ≤&nbsp;10^5</span></div>
 <p></p>
            </div>