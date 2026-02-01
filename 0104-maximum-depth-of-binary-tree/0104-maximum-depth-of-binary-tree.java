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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return check(root);
    }
    private int check(TreeNode root){
        if(root==null) return 0;
        int lh=check(root.left);
        if(lh==-1) return 0;
        int rh=check(root.right);
        if(rh==-1) return 0;
        return Math.max(lh,rh)+1;
    }
}