# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if head is None:
            return None
        if head.next is None:
            return head
        temp = head
        temp1 = head
        n = 1
        while temp.next is not None:
            temp = temp.next
            n +=1 
        temp.next = head 
        k = k % n
        k = n - k -1
        while k > 0:
            temp1 = temp1.next
            k -= 1
        head = temp1.next
        temp1.next = None
        return head
