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
    int count, maxCount = 0;
    TreeNode pre;
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        if(root == null){
            return null;
        }
        mode(root);
        int[] listInt = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            listInt[i] = list.get(i);
        }
        return listInt;
    }
    private void mode(TreeNode root){
        if(root == null){
            return;
        }
        int rootVal = root.val;
        mode(root.left);
        if(pre == null || rootVal != pre.val){
            count = 1;
        }else{
            count++;
        }
        if(maxCount == count){
            list.add(rootVal);
        }else if(count > maxCount){
            list.clear();
            list.add(rootVal);
            maxCount = count;
        }
        pre = root;
        mode(root.right);
    }
}