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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       Queue<TreeNode> q=new LinkedList<>();
       boolean flag=true;
       List<List<Integer>> ls=new ArrayList<>();
       if(root==null) return ls;
       q.add(root);
      while(!q.isEmpty()){
         List<Integer> res=new ArrayList<>();
         int size=q.size();
         for(int i=0;i<size;i++){
            res.add(q.peek().val);
         if(q.peek().left!=null){
            q.add(q.peek().left);
          }
         if(q.peek().right!=null){
            q.add(q.peek().right);
          }
          
          q.poll();
         }
         
         if(!flag){
            Collections.reverse(res);
        }
         flag= !flag;
         ls.add(res);
       }
       return ls;
    }
}