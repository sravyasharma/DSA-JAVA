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
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                map.put(node.val,map.getOrDefault(node.val,0)+1);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
        }
        int max=0,index=0;
        for(int val:map.values()){
            max=Math.max(max,val);
        }
        int count=0;
        for(int val:map.values()){
            if(val==max) count++;
        }
        int[] max1=new int[count];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==max) max1[index++]=entry.getKey();
        }
        return max1;
    }
}