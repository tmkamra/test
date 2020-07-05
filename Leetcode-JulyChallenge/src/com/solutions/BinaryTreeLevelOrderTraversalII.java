package com.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class BinaryTreeLevelOrderTraversalII 
{

	public static void main(String[] args) 
	{
		BinaryTreeLevelOrderTraversalII binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversalII();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		System.out.println(binaryTreeLevelOrderTraversal.levelOrderBottom(root));
	}
	
	private List<List<Integer>> levelOrderBottom(TreeNode root) 
	{
		List result = new ArrayList();
		if(root == null)
			return result;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		
		while(!queue.isEmpty())
		{
			List<Integer> level = new ArrayList<Integer>();
			int size =queue.size();
			for(int i=0 ; i<size; i++)
			{
				TreeNode head = queue.poll();
				level.add(head.val);
				if(head.left!=null)
					queue.offer(head.left);
				if(head.right!=null)
					queue.offer(head.right);
			}
			result.add(0, level);
		}
        return result;
    }

}


//Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
//For example:
//Given binary tree [3,9,20,null,null,15,7],
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its bottom-up level order traversal as:
//[
//  [15,7],
//  [9,20],
//  [3]
//]
