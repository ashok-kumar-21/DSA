package BinaryTrees;

class Node1{
	int data;
	Node1 left;
	Node1 right;
	Node1(int data){
		this.data=data;
		left=null;
		right=null;
	}
}


public class Height {
	
	static int heightOfBinaryTree(Node1 root) {
		if(root==null)
			return 0;
		else {
			int h1=heightOfBinaryTree(root.left);
			int h2=heightOfBinaryTree(root.right);
			return 1+Math.max(h1,h2);
		}
	}

	public static void main(String[] args) {
		 Node1 root=new Node1(4);
		 root.left=new Node1(5);
		 root.right=new Node1(6);
		 root.left.left=new Node1(7);
		 root.left.right=new Node1(8);
		 System.out.println(heightOfBinaryTree(root));
		 

	}

}
