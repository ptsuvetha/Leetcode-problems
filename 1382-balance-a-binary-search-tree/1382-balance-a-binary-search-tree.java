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
    public TreeNode balanceBST(TreeNode root) {
        if(root==null) return null;
        List<Integer> inorder=new ArrayList<>();
        inordertraversal(root,inorder);
        return build(inorder,0,inorder.size()-1);

    }
    private static void inordertraversal(TreeNode root, List<Integer> inorder){
        if(root==null) return ;
        inordertraversal(root.left,inorder);
        inorder.add(root.val);
        inordertraversal(root.right,inorder);
    }
    private static TreeNode build(List<Integer> inorder,int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(inorder.get(mid));
        root.left=build(inorder,left,mid-1);
        root.right=build(inorder,mid+1,right);
        return root;
    }
}