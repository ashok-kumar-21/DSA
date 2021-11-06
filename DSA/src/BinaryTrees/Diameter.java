package BinaryTrees;
import BinaryTrees.Height;

class Pair{
	int height=0;
	int diameter=0;
	Pair(){}
	Pair(int height,int diameter){
		this.height=height;
		this.diameter=diameter;
	}
}

public class Diameter {
	
	static int heightOfBinaryTree(Node1 root) {
		if(root==null)
			return 0;
		else {
			int h1=heightOfBinaryTree(root.left);
			int h2=heightOfBinaryTree(root.right);
			return 1+Math.max(h1,h2);
		}
	}
	
	static int diameterOfBinaryTree(Node1 root) {
		if(root==null) {
			return 0;
		}
		else {
			int d1=heightOfBinaryTree(root.left)+heightOfBinaryTree(root.right);
			int d2=diameterOfBinaryTree(root.left);
			int d3=diameterOfBinaryTree(root.right);
			
			return Math.max(d1,Math.max(d2,d3));
		}
		
	}
	
	static Pair optimizedBinaryTree(Node1 root) {
		Pair p=new Pair();
		if(root==null) {
			return new Pair(0,0);
		}
		else {
			 Pair d1=optimizedBinaryTree(root.left);
			 Pair d2=optimizedBinaryTree(root.right);
			 p.height=Math.max(d1.height,d2.height)+1;
			 p.diameter=Math.max((d1.height+d2.height),Math.max(d1.diameter, d2.diameter));
			 return p;
			 
		}
		
		
	}

	public static void main(String[] args) {
		 Node1 root=new Node1(4);
		 root.left=new Node1(5);
		 root.right=new Node1(6);
		 root.left.left=new Node1(7);
		 root.left.right=new Node1(8);
		 root.left.left.left=new Node1(9);
		 root.left.right.right=new Node1(10);
		 root.left.left.left.left=new Node1(11);
		 root.left.right.right.right=new Node1(12);
		 
		 Pair p=new Pair();
		 
		 System.out.println(optimizedBinaryTree(root).diameter);
		 
		 System.out.println(diameterOfBinaryTree(root));

	}

}
