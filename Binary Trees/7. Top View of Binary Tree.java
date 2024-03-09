class Tuple {
    Node node1;
    int vertical;
    Tuple(Node node1, int vertical){
        this.node1 = node1;
        this.vertical = vertical;
    }
}

class Solution
{
    static ArrayList<Integer> topView(Node root)
    {
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0));
        TreeMap<Integer, Node> mp = new TreeMap<>();
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            int verticalLevel = tuple.vertical;
            Node node = tuple.node1;
            if(!mp.containsKey(verticalLevel)){
                mp.put(verticalLevel, node);
            }
            if(node.left != null){
                q.offer(new Tuple(node.left, verticalLevel-1));
            }
            if(node.right!=null){
                q.offer(new Tuple(node.right, verticalLevel+1));
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(Node node : mp.values()){
            result.add(node.data);
        }
        return result;
    }
}
