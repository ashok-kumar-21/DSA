# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        stack = []
        preorder = []
        if root is None:
            return
        stack.append(root)
        while len(stack) > 0:
            root = stack.pop()
            preorder.append(root.val)
            if root.right is not None:
                stack.append(root.right)
            if root.left is not None:
                stack.append(root.left)
        return preorder   
# go to right and then go to left while appending to stack and iterate till the stack is empty. Do a dry run to understand
