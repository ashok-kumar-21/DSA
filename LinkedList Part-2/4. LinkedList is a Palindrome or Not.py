# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        def reverseHalfLinkedList(head1):
            temp1 = head1
            prev = None
            while temp1 is not None:
                next = temp1.next
                temp1.next = prev
                prev = temp1
                temp1 = next
            return prev
        temp = head
        fastptr = head
        slowptr = head
        while fastptr.next is not None and fastptr.next.next is not None:
            fastptr = fastptr.next.next
            slowptr = slowptr.next
        head2 = reverseHalfLinkedList(slowptr.next)
        temp2 = head2
        while temp2 is not None:
            if temp.val != temp2.val:
                return False 
            temp = temp.next
            temp2 = temp2.next
        return True
#Approach: Find the middle of the linkedlist using tortoise hare approach.
# Reverse the second half of the linkedlist ad return head of the second half
# Compare the first half and the second half
