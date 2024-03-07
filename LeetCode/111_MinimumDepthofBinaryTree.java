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

    int depth = 0;
    int minD = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {

        countD(root);
        return minD == Integer.MAX_VALUE ? 0 : minD;
        // if (root == null) {
        //     return 0;
        // }
        
        // int leftDepth = minDepth(root.left);
        // System.out.println("1. leftDepth: "+ leftDepth);
        // int rightDepth = minDepth(root.right);
        // System.out.println("1. rightDepth: "+ rightDepth);
        // if (root.left == null) {
        //     return rightDepth + 1;
        // }
        // if (root.right == null) {
        //     return leftDepth + 1;
        // }
        // // 左右结点都不为null
        // return Math.min(leftDepth, rightDepth) + 1;
        
    }
    private void countD(TreeNode node){
        if(node == null){
            return;
        }
        depth++;
        countD(node.left);
        countD(node.right);
        if(node.left == null && node.right == null){
            minD = Math.min(minD, depth);
        }
        depth--;
    }
}