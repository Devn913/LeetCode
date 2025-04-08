/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
//inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]

    TreeNode* build(vector<int>& inorder, vector<int>& postorder,int inS, int inE, int pS, int pE,unordered_map<int,int>& mp ){
        if(inS>inE||pS>pE){
            return NULL;
        }


        int rootV = postorder[pE];

        int inIdx = mp[rootV];

        TreeNode* root= new TreeNode(rootV);

        int leftTreeSize = inIdx - inS;
        int rightTreeSize = inE - inIdx;
        root->left = build(inorder,postorder,inS,inIdx-1,pS,pS+leftTreeSize-1,mp);
        root->right = build(inorder,postorder,inIdx+1,inE,pE-rightTreeSize,pE-1,mp);

        return root;

    }

    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {


        unordered_map<int,int> mp;
        int n = inorder.size();

        for(int i=0;i<n;i++){
            mp[inorder[i]]=i;
        }

        return build(inorder,postorder,0,n-1,0,n-1,mp);
        
    }
};