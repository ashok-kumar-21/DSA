# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root is None:
            return []
        q = Deque()
        q.append(root)
        l = []
        while len(q) > 0:
            l1 = []
            n = len(q)
            for i in range(n):
                node = q.popleft()
                l1.append(node.val)
                if node.left is not None:
                    q.append(node.left)
                if node.right is not None:
                    q.append(node.right)
            l.append(l1)
        return l
                   
