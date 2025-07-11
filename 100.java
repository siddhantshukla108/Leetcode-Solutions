// Leetcode solution 100:-
     
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both trees are empty
        if (p == null && q == null) return true;

        // One of the trees is empty
        if (p == null || q == null) return false;

        // Check current node values and recurse for left and right subtrees
        return (p.val == q.val)
            && isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
    }
}
