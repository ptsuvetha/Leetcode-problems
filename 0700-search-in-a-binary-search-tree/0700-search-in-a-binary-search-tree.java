/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private static TreeNode dfs(TreeNode root,int val){
        if(root==null) return null;
       while(root!=null && root.val!=val){ 
        if(val<root.val){
            root=root.left;
        }
        else{
            root=root.right;
        }
       }
        return root;
    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        TreeNode node=dfs(root,val);
        return node;
    }
}