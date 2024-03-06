/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Tuple {
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode node, int row, int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Tuple> q = new LinkedList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> mp = new TreeMap<>();
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()){
            Tuple node1 = q.poll();
            TreeNode treenode = node1.node;
            int row = node1.row;
            int col = node1.col;
            if(!mp.containsKey(col)){
                mp.put(col, new TreeMap<>());
            }
            if(!mp.get(col).containsKey(row)){
                mp.get(col).put(row, new PriorityQueue<>());
            }
            mp.get(col).get(row).offer(treenode.val);
            if(treenode.left != null){
                q.offer(new Tuple(treenode.left, row+1, col-1));
            }
            if(treenode.right != null){
                q.offer(new Tuple(treenode.right, row+1, col+1));
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> ys : mp.values()){
            List<Integer> list1 = new ArrayList<>();
            for(PriorityQueue<Integer> k : ys.values()){
                while(!k.isEmpty()){
                    list1.add(k.poll());
                }
            }
            list.add(list1);
        }
        return list;
    }
}
// Use level order traversal and just remember the datastructure you are using to store the values. Rest all is quite simple
