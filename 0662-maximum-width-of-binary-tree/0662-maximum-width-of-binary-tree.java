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
 class Pair{
    TreeNode node;
    int i;
    Pair(TreeNode node,int i){
        this.node=node;
        this.i=i;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> q=new LinkedList<>();
        int maxwidth=0;
        q.offer(new Pair(root,0));
        int fi=0,li=0;

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair cell=q.poll();
                TreeNode ele=cell.node;
                int ind=cell.i;
                if(i==0){
                    fi=ind;// to access the min index in the level
                }
                if(i==size-1){
                    li=ind;// to access the max index in the level
                }
                if(ele.left!=null){
                    q.add(new Pair(ele.left,2*ind));
                }
                if(ele.right!=null){
                    q.add(new Pair(ele.right,2*ind+1));
                }

            }
            maxwidth=Math.max(maxwidth,li-fi+1);

        }
        return maxwidth;
    }
}
