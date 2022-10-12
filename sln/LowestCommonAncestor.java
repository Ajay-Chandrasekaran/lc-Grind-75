// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

package sln;

public class LowestCommonAncestor {
	public TreeNode solve(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > q.val) {
			return solve(root.left, p, q);
		} else if (root.val < p.val) {
			return solve(root.right, p, q);
		} else {
			return root;
		}
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode left, right;
        if (p.val < q.val) {
            left = p;
            right = q;
        } else {
            left = q;
            right = p;
        }
        return solve(root, left, right);
    }
}
