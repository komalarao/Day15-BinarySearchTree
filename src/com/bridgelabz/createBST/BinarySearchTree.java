package com.bridgelabz.createBST;

public class BinarySearchTree {
	class INode {

		int key;
		INode left, right;

		public INode(int item) {

		key = item;
		left = right = null;

		}

		}
	
		INode root;

		BinarySearchTree() {

		root = null;

		}

		// This method calls insertrec method to call method recursively

		void insert(int key) {

		root = insertRec(root, key);

		}

		INode insertRec(INode root, int key) {

		
		if (root == null) {

		root = new INode(key);

		return root;

		}


		if (key < root.key)
		root.left = insertRec(root.left, key);
		else if (key > root.key)
		root.right = insertRec(root.right, key);

		return root;

		}

		void inorder() {

		inorderRec(root);

		}

		// do inorder traversal of BST

		void inorderRec(INode root) {

		if (root != null) {

		inorderRec(root.left);

		System.out.println(root.key);

		inorderRec(root.right);

		}

		}


		public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		
		tree.inorder();

		}

}
