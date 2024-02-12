# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fastptr = head
        slowptr = head
        for i in range(n):
            fastptr = fastptr.next
        if fastptr is None:
            return head.next
        while fastptr.next is not None:
            fastptr = fastptr.next
            slowptr = slowptr.next 
        slowptr.next = slowptr.next.next
        return head
#Time Complexity = O(n)
#Space Complexity = O(1)
