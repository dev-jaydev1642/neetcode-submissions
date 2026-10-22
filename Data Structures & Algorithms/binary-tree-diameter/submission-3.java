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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxDiameter = new int[1];
        calculateHeight(root, maxDiameter);
        return maxDiameter[0];
    }

    private int calculateHeight(TreeNode root, int[] maxDiameter) {
        if (root == null) return 0;

        int left = calculateHeight(root.left, maxDiameter);
        int right = calculateHeight(root.right, maxDiameter);

        maxDiameter[0] = Math.max(left + right, maxDiameter[0]);

        return Math.max(left, right) + 1;
    }

    
}
