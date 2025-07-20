new leetcode solution 
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: If both nodes are null, they are identical at this point.
        if (p == null && q == null) {
            return true;
        }
        // Base case: If one node is null and the other is not, they are not identical.
        if (p == null || q == null) {
            return false;
        }
        // Base case: If the values of the current nodes are different, they are not identical.
        if (p.val != q.val) {
            return false;
        }
        // Recursive step: Check if the left subtrees are identical AND if the right subtrees are identical.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
