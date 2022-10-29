# Rotate Array
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an unsorted array <strong>arr[]</strong> of size <strong>N.</strong>&nbsp;Rotate the array to the left (counter-clockwise direction) by <strong>D</strong> steps, where&nbsp;<strong>D</strong>&nbsp;is a positive integer.&nbsp;</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 5, D = 2
arr[] = {1,2,3,4,5}
<strong>Output: </strong>3 4 5 1 2<strong>
</strong><strong>Explanation: </strong>1 2 3 4 5&nbsp; when rotated
by 2 elements, it becomes 3 4 5 1 2.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 10, D = 3
arr[] = {2,4,6,8,10,12,14,16,18,20}
<strong>Output: </strong>8 10 12 14 16 18 20 2 4 6<strong>
Explanation: </strong>2 4 6 8 10 12 14 16 18 20&nbsp;
when rotated by 3 elements, it becomes 
8 10 12 14 16 18 20 2 4 6.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your&nbsp;Task:</strong><br>
Complete the function <strong>rotateArr</strong>() which takes the array, D and N as input parameters and&nbsp;rotates the array by D elements. The array must be modified in-place without using extra space.&nbsp;</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10</span><sup><span style="font-size:15px">6</span></sup><br>
<span style="font-size:18px">1 &lt;= D &lt;= 10<sup>6</sup></span><br>
<span style="font-size:18px">0 &lt;=&nbsp;arr[i] &lt;= 10</span><sup>5</sup></p>
</div>