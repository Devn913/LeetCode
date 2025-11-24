# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    

    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        def getInoderSucc(root):
        
            while(root.right is not None):
                root = root.right
            return root
        
        def getInorderPrec(root):

            while(root.left is not None):
                root = root.left
            return root

        if(root is None):
            return None
        
        if(root.val<key):
            root.right = self.deleteNode(root.right,key)
        elif(root.val>key):
            root.left = self.deleteNode(root.left,key)
        else:
            if(root.left == None):
                return root.right
            elif(root.right == None):
                return root.left
            
            # node = getInoderSucc(root.left)
            node = getInorderPrec(root.right)
            root.val = node.val
            root.right = self.deleteNode(root.right,node.val)
        return root