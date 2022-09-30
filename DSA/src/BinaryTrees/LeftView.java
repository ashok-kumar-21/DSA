package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftView {
	
	 static List<Integer> leftSideView(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root == null)
            return new ArrayList<Integer>();
        List<Integer> arr = new ArrayList<>();
        Node temp;
        queue.add(root);
        while(!(queue.isEmpty())){
            int n = queue.size();
            for(int i=0;i<n;i++){
                temp = queue.poll();
                if(i==0)
                    arr.add(temp.data);
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
            											
        }
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);
        root.right.right.left.right = new Node(9);
        System.out.println(leftSideView(root));

	}

}
