# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        fastptr = head
        slowptr = head
        entry = head
        while fastptr is not None and fastptr.next is not None:
            fastptr = fastptr.next.next
            slowptr = slowptr.next
            if fastptr == slowptr:
                while slowptr != entry:
                    slowptr = slowptr.next
                    entry = entry.next
                return slowptr
        return None

        
