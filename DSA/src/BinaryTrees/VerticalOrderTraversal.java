package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Tuple{
	int hd;
	Node node;
	public Tuple(int hd,Node node) {
		this.hd = hd;
		this.node  = node;
	}
}

public class VerticalOrderTraversal {
	
	static void verticalOrderTraversal(Node root) {
		TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
		Queue<Tuple> queue = new LinkedList<>();
		queue.add(new Tuple(0,root));
		if(root == null)
			return ;
		while(!queue.isEmpty()) {
			Tuple temp = queue.poll();
			if(map.containsKey(temp.hd)) {
				map.get(temp.hd).add(temp.node.data);
			}
			else {
				ArrayList<Integer> arr = new ArrayList<>();
				arr.add(temp.node.data);
				map.put(temp.hd, arr);
			}
			if(temp.node.left != null)
				queue.add(new Tuple((temp.hd)-1, temp.node.left));
			if(temp.node.right != null)
				queue.add(new Tuple((temp.hd)-1, temp.node.right));
		}
		for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
			ArrayList<Integer> al = entry.getValue();
			for(Integer i : al)
				System.out.print(i+" ");
			System.out.println();
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.right = new Node(6);
        root.left.left.right.right = new Node(7);
        root.right.left = new Node(9);
        verticalOrderTraversal(root);

	}

}
