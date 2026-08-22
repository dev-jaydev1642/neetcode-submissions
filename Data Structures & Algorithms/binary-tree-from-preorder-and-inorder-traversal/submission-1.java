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
    private int in = 0;
    private int pre = 0;

    private int preorderIndex;
    private Map<Integer, Integer> inorderIndexMap; 

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // preorderIndex = 0;
        // inorderIndexMap = new HashMap<>();

        // for (int i = 0; i < inorder.length; i++) {
        //     inorderIndexMap.put(inorder[i] , i);
        // }

        // return arrayToTree(preorder, 0, inorder.length - 1);

        return build(preorder, inorder, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int[] inorder, int stopVal) {
        if (pre >= preorder.length) return null;

        if (inorder[in] == stopVal) {
            in++;
            return null;
        }

        int rootVal = preorder[pre++];
        TreeNode root = new TreeNode(rootVal);

        root.left = build(preorder, inorder, rootVal);
        root.right = build(preorder, inorder, stopVal);

        return root; 
    }

    private TreeNode arrayToTree(int[] preorder, int left, int right) {
        if (left > right) return null;
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        int inorderRootIndex = inorderIndexMap.get(rootVal);

        root.left = arrayToTree(preorder, left, inorderRootIndex - 1);
        root.right = arrayToTree(preorder, inorderRootIndex + 1, right);

        return root;
    }
}
