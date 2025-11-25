# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        def getSucc(root):
            while(root.left!=None):
                root = root.left
            return root
        
        def getPred(root):
            while(root.right!=None):
                root = root.right
            return root

        if(root == None):
            return None

        if(root.val >key):
            root.left = self.deleteNode(root.left,key)
        elif(root.val<key):
            root.right = self.deleteNode(root.right,key)
        else:
            if(root.left == None and root.right == None):
                return None
            if(root.left == None):
                return root.right
            if(root.right == None):
                return root.left
            
            # node = getSucc(root.right)
            node = getPred(root.left)
            root.val = node.val
            root.left = self.deleteNode(root.left,node.val)
            # root.right = self.deleteNode(root.right,node.val)
        return root

            




        