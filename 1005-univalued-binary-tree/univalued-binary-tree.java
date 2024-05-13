class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return true;

        return solve(root, root.val);
    }

    private boolean solve(TreeNode root, int rootVal) {
        if (root == null)
            return true;

        if (root.val != rootVal)
            return false;
        return solve(root.left, rootVal) && solve(root.right, rootVal);
    }
}
