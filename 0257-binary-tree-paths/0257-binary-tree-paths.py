# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        res = []

        if(root.left == root.right == None):
            res.append(str(root.val))
            return res
        if(root == None):
            return []
        def helper(root, curr_path=""):
            if(root == None):
                return 

            if(root.left == root.right == None):
                res.append(curr_path + "->" + str(root.val))
                return

            helper(root.left,curr_path + "->" + str(root.val))
            helper(root.right,curr_path + "->" + str(root.val))
    
        helper(root.left,str(root.val))
        helper(root.right,str(root.val))
        return res
            
            


