# Buildings receiving sunlight
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given are the <strong>heights</strong> of certain Buildings which&nbsp;lie adjacent to each other. Sunlight starts falling from the left side of the buildings.&nbsp;If there is a building of a certain Height, all the buildings to the right side of it having lesser heights cannot see the sun. The task is to find the total number of such buildings that receive sunlight.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 6
H[] = {6, 2, 8, 4, 11, 13}
<strong>Output:</strong>
4
<strong>Explanation:</strong>
Only buildings of height 6, 8, 11 and
13 can see the sun, hence output is 4.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5
H[] = {2, 5, 1, 8, 3}
<strong>Output:</strong>
3
<strong>Explanation:</strong>
Only buildings of height 2, 5 and 8
can see the sun, hence output is 3.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 3:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 7
H[] = {3, 4, 1, 0, 6, 2, 3}
<strong>Output:</strong>
3</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>longest()</strong>&nbsp;which takes the array <strong>A[]</strong> and its size <strong>N</strong><strong> </strong>as inputs and returns the desired output.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N)<br>
<strong>Expected Auxiliary Space: </strong>O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ H<sub>i</sub> ≤ 10<sup>5</sup></span></p>
 <p></p>
            </div>