package Array.Medium;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/**
 * 106. Construct Binary Tree from Inorder and Postorder Traversal
 * 
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * 
 * For example, given
 * inorder = [9,3,15,20,7]
 * postorder = [9,15,7,20,3]
 * Return the following binary tree:
 * 
 *  		3
 *  	   / \
 *  	  9  20
 * 			/  \
 *  	   15   7
 * 
 * link : https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 */

public class _106_ConstructBTInPostTraversal {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		return construct(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
	}

	public TreeNode construct(int[] in, int ilo, int ihi, int[] post, int plo, int phi) {

		if (ilo > ihi || plo > phi) {
			return null;
		}

		TreeNode nn = new TreeNode(post[phi]);

		int si = -1;

		// search
		for (int i = ilo; i <= ihi; i++) {
			if (post[phi] == in[i]) {
				si = i;
				break;
			}
		}

		int nel = si - ilo;

		nn.left = construct(in, ilo, si - 1, post, plo, plo + nel - 1);
		nn.right = construct(in, si + 1, ihi, post, plo + nel, phi - 1);

		return nn;
	}
}
