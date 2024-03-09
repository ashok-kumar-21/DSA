def allRootToLeaf(root: TreeNode) -> List[str]:
    def dfs(node, path):
        if not node:
            return
        path.append(str(node.data))
        if not node.left and not node.right:
            result.append("->".join(path))
        else:
            dfs(node.left, path)
            dfs(node.right, path)
        path.pop()  # Remove the current node as we backtrack

    result = []
    dfs(root, [])
    return result
  
1. We use a depth-first search (DFS) approach with backtracking.
2. We avoid creating copies of the path list by passing the same list to each recursive call.
3. We remove the current node from the path list (path.pop()) after visiting its children to backtrack properly. This ensures that the path list is correctly maintained as we traverse different paths in the tree.
