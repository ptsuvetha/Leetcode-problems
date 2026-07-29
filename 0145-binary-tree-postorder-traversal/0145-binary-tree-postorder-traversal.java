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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lis=new ArrayList<>();
        if(root==null) return lis;
        postorder(root,lis);
        return lis;
    }
    private void postorder(TreeNode root,List<Integer> lis){
        if(root==null) return;
        if(root.left!=null){
            postorder(root.left,lis);
        }
        if(root.right!=null){
            postorder(root.right,lis);
        }
        lis.add(root.val);
    }
}