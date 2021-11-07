package BinaryTrees;

public class SymmetricTree {
	static boolean isMirror(Node node1,Node node2) {
		if(node1==null  && node2==null)
			return true;
		if(node1!=null && node2!=null && node1.data==node2.data) 
				return (isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left));
		return false;
	}
	
	public static void main(String[] args) {
		
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
		System.out.println(isMirror(root,root));
		
	}

}
