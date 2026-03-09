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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
     Deque<TreeNode> q=new LinkedList<>();
      LinkedList<List<Integer>> res=new LinkedList<>();
      if(root==null) return res;
      q.addLast(root);
      while(!q.isEmpty()){
        List<Integer> ans=new ArrayList<>();
        int size=q.size();
        for(int i=0;i<size;i++){
            TreeNode node=q.pollFirst();
            ans.add(node.val);
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
        }
        res.addFirst(ans);

      }  
      return res;
    }
}