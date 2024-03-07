class Solution {
    int max = 0;
    public int maxDepth(TreeNode root) {
        countD(root, 0);
        return max;

    }

    private void countD(TreeNode node, int count){
        if(node == null){
            return;
        }
        count++;
        max = max < count ? count : max;
        countD(node.left, count);
        countD(node.right, count);
        count--;
    }
}
