<h2><a href="https://leetcode.com/problems/make-a-square-with-the-same-color">3398. Make a Square with the Same Color</a></h2><h3>Easy</h3><hr><p>You are given a 2D matrix <code>grid</code> of size <code>3 x 3</code> consisting only of characters <code>&#39;B&#39;</code> and <code>&#39;W&#39;</code>. Character <code>&#39;W&#39;</code> represents the white color<!-- notionvc: 06a49cc0-a296-4bd2-9bfe-c8818edeb53a -->, and character <code>&#39;B&#39;</code> represents the black color<!-- notionvc: 06a49cc0-a296-4bd2-9bfe-c8818edeb53a -->.</p>

<p>Your task is to change the color of <strong>at most one</strong> cell<!-- notionvc: c04cb478-8dd5-49b1-80bb-727c6b1e0232 --> so that the matrix has a <code>2 x 2</code> square where all cells are of the same color.<!-- notionvc: adf957e1-fa0f-40e5-9a2e-933b95e276a7 --></p>

<p>Return <code>true</code> if it is possible to create a <code>2 x 2</code> square of the same color, otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>
<style type="text/css">.grid-container {
  display: grid;
  grid-template-columns: 30px 30px 30px;
  padding: 10px;
}
.grid-item {
  background-color: black;
  border: 1px solid gray;
  height: 30px;
  font-size: 30px;
  text-align: center;
}
.grid-item-white {
  background-color: white;
}
</style>
<style class="darkreader darkreader--sync" media="screen" type="text/css">
</style>
<p><strong class="example">Example 1:</strong></p>

<div class="grid-container">
<div class="grid-item">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item">&nbsp;</div>

<div class="grid-item">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item">&nbsp;</div>
</div>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">grid = [[&quot;B&quot;,&quot;W&quot;,&quot;B&quot;],[&quot;B&quot;,&quot;W&quot;,&quot;W&quot;],[&quot;B&quot;,&quot;W&quot;,&quot;B&quot;]]</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>

<p><strong>Explanation:</strong></p>

<p>It can be done by changing the color of the <code>grid[0][2]</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="grid-container">
<div class="grid-item">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item">&nbsp;</div>
</div>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">grid = [[&quot;B&quot;,&quot;W&quot;,&quot;B&quot;],[&quot;W&quot;,&quot;B&quot;,&quot;W&quot;],[&quot;B&quot;,&quot;W&quot;,&quot;B&quot;]]</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>

<p><strong>Explanation:</strong></p>

<p>It cannot be done by changing at most one cell.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="grid-container">
<div class="grid-item">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item">&nbsp;</div>

<div class="grid-item">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>

<div class="grid-item grid-item-white">&nbsp;</div>
</div>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">grid = [[&quot;B&quot;,&quot;W&quot;,&quot;B&quot;],[&quot;B&quot;,&quot;W&quot;,&quot;W&quot;],[&quot;B&quot;,&quot;W&quot;,&quot;W&quot;]]</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>

<p><strong>Explanation:</strong></p>

<p>The <code>grid</code> already contains a <code>2 x 2</code> square of the same color.<!-- notionvc: 9a8b2d3d-1e73-457a-abe0-c16af51ad5c2 --></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>grid.length == 3</code></li>
	<li><code>grid[i].length == 3</code></li>
	<li><code>grid[i][j]</code> is either <code>&#39;W&#39;</code> or <code>&#39;B&#39;</code>.</li>
</ul>
