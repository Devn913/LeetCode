# Binary Search
## Easy
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a sorted array of size <strong>N</strong> and an integer <strong>K</strong>, find the position at which <strong>K</strong> is present in the array using binary search.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5
arr[] = {1 2 3 4 5} 
K = 4
<strong>Output:</strong> 3
<strong>Explanation:</strong> 4 appears at index 3.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5
arr[] = {11 22 33 44 55} 
K = 445
<strong>Output:</strong> -1
<strong>Explanation:</strong> 445 is not present.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task: &nbsp;</strong><br>
You dont need to read input or print anything. Complete the function <strong>binarysearch()</strong> which takes <strong>arr[]</strong>, <strong>N</strong> and <strong>K</strong> as input parameters and returns the index of <strong>K</strong> in the array. If <strong>K</strong> is not present in the array, return -1.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(LogN)<br>
<strong>Expected Auxiliary Space:</strong> O(LogN) if solving recursively and O(1) otherwise.</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong></span></p>

<ul>
	<li><span style="font-size:18px">1 &lt;= N &lt;= 10</span><sup><span style="font-size:15px">5</span></sup></li>
	<li><span style="font-size:18px">1 &lt;= arr[i] &lt;= 10<sup>6</sup></span></li>
	<li><span style="font-size:18px">1 &lt;= K &lt;= 10<sup>6</sup></span></li>
</ul>
 <p></p>
            </div>