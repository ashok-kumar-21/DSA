# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        #root, right, left 
        stack = []
        def rightSideViewHelper(node, level):
            if node is None:
                return 
            if len(stack) == level:
                stack.append(node.val)
            rightSideViewHelper(node.right, level + 1)
            rightSideViewHelper(node.left, level + 1)
        rightSideViewHelper(root, 0)
        return stack
      
