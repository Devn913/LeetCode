# Rearrange a linked list
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a singly linked list, the task is to rearrange it in a way that all odd position nodes are together and all even positions node are together.<br>
Assume the first element to be at position 1 followed by second element at position 2 and so on.<br>
<strong>Note: </strong>You should place all odd positioned nodes first and then the even positioned ones. (considering 1 based indexing). Also, the relative order of odd positioned nodes and even positioned nodes should be maintained.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList: 1-&gt;2-&gt;3-&gt;4
<strong>Output: </strong>1 3 2 4 
<strong>Explanation: </strong>
Odd elements are 1, 3 and even elements are 
2, 4. Hence, resultant linked list is 
1-&gt;3-&gt;2-&gt;4.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList: 1-&gt;2-&gt;3-&gt;4-&gt;5
<strong>Output: </strong>1 3 5 2 4 
<strong>Explanation:</strong> 
Odd elements are 1, 3, 5 and even elements are
2, 4. Hence, resultant linked list is
â€‹1-&gt;3-&gt;5-&gt;2-&gt;4.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function&nbsp;<strong>rearrangeEvenOdd</strong>() which rearranges the nodes in the linked list as required and doesn't return <strong>anything</strong>.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ Size of the linked list&nbsp;≤ 10<sup>4</sup><br>
0 ≤ value of linked list ≤ 10<sup>3</sup></span></p>
 <p></p>
            </div>