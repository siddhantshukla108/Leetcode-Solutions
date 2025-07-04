class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        inorder(node.left, result);     // Visit left subtree
        result.add(node.val);           // Visit node itself
        inorder(node.right, result);    // Visit right subtree
    }
}
