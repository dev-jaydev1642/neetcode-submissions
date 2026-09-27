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
    private int maxPathSum;

    public int maxPathSum(TreeNode root) {
        maxPathSum = Integer.MIN_VALUE;
        calculateMaxGain(root);
        return maxPathSum;
    }

    public int calculateMaxGain(TreeNode node) {
        if (node == null) return 0;

        int leftGain = Math.max(calculateMaxGain(node.left), 0);
        int rightGain = Math.max(calculateMaxGain(node.right), 0);

        int currPathSum = node.val + leftGain + rightGain;

        maxPathSum = Math.max(maxPathSum, currPathSum);

        return node.val + Math.max(leftGain, rightGain);
    }
}
