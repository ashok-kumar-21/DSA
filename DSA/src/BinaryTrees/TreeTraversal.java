package BinaryTrees;

import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
public class TreeTraversal {
	static Scanner sc=new Scanner(System.in);
	static Node createBinaryTree() {
		int d=sc.nextInt();
		if(d==-1)
			return null ;
		Node root=new Node(d);
	    root.left=createBinaryTree();
	    root.right=createBinaryTree();
	    return root;
	}
	static void inOrder(Node root) {
		if(root==null)
			return ;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	static void preOrder(Node root) {
		if(root==null)
			return ;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	static void postOrder(Node root) {
		if(root==null)
			return ;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	static void levelOrderTraversal(Node root) {
		Queue<Node> q=new ArrayDeque<>();
		if(root==null)
			return ;
		else {
			q.add(root);
			while(!q.isEmpty()) {
				Node temp=q.poll();
				System.out.print(temp.data+" ");
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=createBinaryTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		levelOrderTraversal(root);

	}

}
