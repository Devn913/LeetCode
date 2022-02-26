/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    public class pair{
        TreeNode root;
        int index;
        pair(TreeNode root, int index){
            this.root = root;
            this.index = index;
        }
    }
    public String serialize(TreeNode root){
        if(root == null){
            String s = "N";
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(root.val));
        sb.append(",");
        sb.append(serialize(root.left));
        sb.append(",");
        sb.append(serialize(root.right));
        return sb.toString();
    }
    // Decodes your encoded data to tree.
    private pair helper(String[] s, int index){
        if(index >= s.length) return new pair(null, index);
        if(s[index].equals("N")) return new pair(null, index+1);
        int val = Integer.parseInt(s[index++]);
        TreeNode root = new TreeNode(val);
        pair left = helper(s, index);
        pair right = helper(s, left.index);
        root.left = left.root;
        root.right = right.root;
        return new pair(root, right.index);
    }
    public TreeNode deserialize(String s) {
        if(s.equals("N")) return null;
        String[] res = s.split(",");
        return helper(res,0).root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;