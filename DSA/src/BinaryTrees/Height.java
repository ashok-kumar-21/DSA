package BinaryTrees;

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


public class Height {
	
	static int heightOfBinaryTree(Node root) {
		if(root==null)
			return 0;
		else {
			int h1=heightOfBinaryTree(root.left);
			int h2=heightOfBinaryTree(root.right);
			return 1+Math.max(h1,h2);
		}
	}

	public static void main(String[] args) {
		 Node root=new Node(4);
		 root.left=new Node(5);
		 root.right=new Node(6);
		 root.left.left=new Node(7);
		 root.left.right=new Node(8);
		 System.out.println(heightOfBinaryTree(root));
		 

	}

}
