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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> sumq=new LinkedList<>();
        if(root==null) return false;
        q.add(root);
        sumq.add(root.val);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            int sum=sumq.poll();
            if(node.left==null && node.right==null) if(sum==targetSum) return true;
                if(node.left!=null){
                    q.add(node.left);
                    sumq.add(sum+node.left.val);
                }
                if(node.right!=null){
                    q.add(node.right);
                    sumq.add(sum+node.right.val);
                }
        }
        return false;
    }
}