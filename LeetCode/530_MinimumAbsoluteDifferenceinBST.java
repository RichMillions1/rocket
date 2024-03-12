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
    int result = Integer.MAX_VALUE;
    TreeNode pre;
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return 0;
        }
        miniAbs(root);
        return result;
    }
    private void miniAbs(TreeNode root){
        if(root == null){
            return;
        }
        miniAbs(root.left);
        if(pre != null){
            result = Math.min(result, Math.abs(pre.val - root.val));
        }
        pre = root;
        miniAbs(root.right);
    }
}