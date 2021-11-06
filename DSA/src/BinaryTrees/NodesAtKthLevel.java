package BinaryTrees;

import java.util.*;
import BinaryTrees.Node;

public class NodesAtKthLevel {

	static ArrayList<Integer> printKthLevel(Node root, int k){
		ArrayList<Integer> arr=new ArrayList<>();
		Queue<Node> q=new ArrayDeque<>();
		int level=0;
		if(root==null)
			return null;
		else {
			q.add(root);
			level++;
			while(!q.isEmpty()) {
				if(level==k) {
					Node temp=q.poll();
					arr.add(temp.data);
				}
				else {
					int size=q.size();
					while(size>0) {
						size--;
						Node temp1=q.poll();
						if(temp1.left!=null) {
							q.add(temp1.left);
						}
						if(temp1.right!=null) {
							q.add(temp1.right);
						}
					}
					level++;
				}
			}
		}
		return arr;



	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		one.left = two;
		one.right = three;
		two.right = five;
		two.left = four;

		System.out.print(printKthLevel(one, 2));

	}

}
