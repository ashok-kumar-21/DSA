package BinaryTrees;

import java.util.*;
class Qitem{
	int depth;
	Node node;
	public Qitem(int depth, Node node) {
		this.depth = depth;
		this.node = node;
	}
}
public class MinDepth {
	
	static int minDepth(Node root) {
		if(root==null) {
			return 0;
		}
		else {
			int h1=minDepth(root.left);
			int h2=minDepth(root.right);
			return 1+Math.min(h1, h2);
			
			
		}
	}
	
	
	static int minDepthUsingLevelOrderTraversal(Node root) {
		if(root==null) {
			return 0;
		}
		Queue<Qitem> q=new ArrayDeque<>();
		Qitem qi=new Qitem(1,root);
		q.add(qi);
		while(!q.isEmpty()) {
			qi=q.poll();
			Node node=qi.node;
			int depth=qi.depth;
			if(node.left==null && node.right==null) {
				return depth;
			}
			if(node.left!=null) {
				qi.node=node.left;
				qi.depth=depth+1;
				q.add(qi);
			}
			if(node.right!=null) {
				qi.node=node.right;
				qi.depth=depth+1;
				q.add(qi);
			}
			
		}
		return 0;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
	    root.left = new Node(2);
	    root.right = new Node(3);
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	 
	    System.out.println(minDepth(root));
	    System.out.println(minDepthUsingLevelOrderTraversal(root));

	}

}
