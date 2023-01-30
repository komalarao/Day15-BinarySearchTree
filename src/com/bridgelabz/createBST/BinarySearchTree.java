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
		public static boolean flag = false;

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

		} // Function to return the size of binary tree
	    int size() { return size(root); }
	    
	    /* computes number of nodes in tree */
	    int size(INode node)
	    {
	        if (node == null) 
	        	return 0;
	        
	        else 
	            return (size(node.left) + 1 + size(node.right)); 
	    } boolean isFullTree(INode node)
	    {
	        // if empty tree
	        if(node == null)
	        return true;
	          
	        // if leaf node
	        if(node.left == null && node.right == null )
	            return true;
	          
	        // if both left and right subtrees are not null
	        // they are full
	        if((node.left!=null) && (node.right!=null))
	            return (isFullTree(node.left) && isFullTree(node.right));
	          
	        // if none work
	        return false;
	    } public void searchElement(INode temp, int value){  
	        //Check whether tree is empty  
	        if(root == null){  
	          System.out.println("Tree is empty");  
	        }  
	        else{  
	          //If value is found in the given binary tree then, set the flag to true  
	          if(temp.key == value){  
	            flag = true;  
	               return;  
	          }  
	          //Search in left subtree  
	          if(flag == false && temp.left != null){  
	             searchElement(temp.left, value);  
	          }  
	          //Search in right subtree  
	          if(flag == false && temp.right != null){  
	             searchElement(temp.right, value);  
	          }  
	        }  
	      }  
	 

		public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.insert(60);
		tree.insert(95);
		tree.insert(65);
		tree.insert(63);
		tree.insert(67);
		tree.insert(22);
		tree.insert(40);
		tree.insert(11);
		tree.insert(3);
		tree.insert(16);
		tree.inorder();		
        System.out.println("size of binary tree is "+tree.size());
        
        if(tree.isFullTree(tree.root))
            System.out.print("The binary tree is full");
        else
            System.out.println("The binary tree is not full");
        
        tree.searchElement(tree.root,16);
        
        if(flag == true)
            System.out.println("Element is present in the binary tree");  
        else
            System.out.println("Element is not present in the binary tree");  

		}

}
