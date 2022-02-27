# Count distinct elements in every window
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">N = 7, K = 4
A[] = {1,2,1,3,4,2,3}
<strong>Output: </strong>3 4 4 3<strong>
Explanation: </strong>Window 1 of size k = 4 is
1 2 1 3. Number of distinct elements in
this window are 3.&nbsp;
Window 2&nbsp;of size k = 4 is&nbsp;2 1 3 4.&nbsp;</span><span style="font-size:18px">Number
of distinct elements in this window are 4.</span>
<span style="font-size:18px">Window 3&nbsp;of size k = 4 is&nbsp;1 3 4 2.&nbsp;</span><span style="font-size:18px">Number
of distinct elements in this window are 4.</span>
<span style="font-size:18px">Window 4&nbsp;of size k = 4 is&nbsp;</span><span style="font-size:18px">3 4 2 3.&nbsp;Number
of distinct elements in this window are 3.</span>
</pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">N = 3, K = 2
A[] = {4,1,1}
<strong>Output: </strong>2 1</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Your task is to complete the function&nbsp;<strong>countDistinct()</strong>&nbsp;which takes the array A[], the size of the array(N) and the window size(K) as inputs and returns an array containing the count of distinct elements in every contiguous window of size K in the array A[].</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= K&nbsp;&lt;= N&nbsp;&lt;= 10<sup>5</sup></span><br>
<span style="font-size:18px">1 &lt;= A[i] &lt;= 10<sup>5&nbsp;</sup>, for each valid i</span></p>
 <p></p>
            </div>