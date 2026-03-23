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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        TreeNode temp=root;
        while(true){
            if(temp.val>val){
                if(temp.left==null){
                    temp.left=new TreeNode(val);
                    break;
                }
                else temp=temp.left;
            }
           else{
            if(temp.right==null){
                temp.right=new TreeNode(val);
                break;
            }
            else temp=temp.right;
           }
            
        }
        
        return root;
    }
}