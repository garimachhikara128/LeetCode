package Array.Medium;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 * 
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * 
 * For example, given
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
 * Return the following binary tree:
 * 
 * 			3
 * 		   / \
 *        9  20
 *          /  \
 *         15   7
 * 
 * link : https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */

public class _105_ConstructBTPreInTraversal {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
	}

	public TreeNode construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {

		if (ilo > ihi || plo > phi) {
			return null;
		}

		TreeNode nn = new TreeNode(pre[plo]);

		int si = -1;

		// search
		for (int i = ilo; i <= ihi; i++) {
			if (pre[plo] == in[i]) {
				si = i;
				break;
			}
		}

		int nel = si - ilo;

		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return nn;
	}
}
