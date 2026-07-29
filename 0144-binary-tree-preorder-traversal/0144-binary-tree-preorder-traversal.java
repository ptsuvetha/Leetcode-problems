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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lis=new ArrayList<>();
       if(root==null) return lis;
       
       preorder(root,lis); 
       return lis;
    }
    private void  preorder(TreeNode root,List<Integer> lis){
        if(root==null) return;
        lis.add(root.val);
        if(root.left!=null){
            preorder(root.left,lis);
        }
        if(root.right!=null){
            preorder(root.right,lis);
        }
    }
}