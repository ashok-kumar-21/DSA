# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        fastptr = head
        slowptr = head
        while fastptr is not None and fastptr.next is not None:
            fastptr = fastptr.next.next
            slowptr = slowptr.next
            if fastptr == slowptr:
                return True
        return False
        
