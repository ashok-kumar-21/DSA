import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Pair {
    TreeNode treeNode;
    int index;
    Pair(TreeNode treeNode, int index) {
        this.treeNode = treeNode;
        this.index = index;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int answer = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            int mini = queue.peek().index;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair current = queue.poll();
                int currIndex = current.index - mini;
                TreeNode node = current.treeNode;

                if (i == 0) first = currIndex;
                if (i == size - 1) last = currIndex;

                if (node.left != null) {
                    queue.offer(new Pair(node.left, currIndex * 2 + 1));
                }
                if (node.right != null) {
                    queue.offer(new Pair(node.right, currIndex * 2 + 2));
                }
            }
            answer = Math.max(answer, last - first + 1);
        }

        return answer;
    }
}
