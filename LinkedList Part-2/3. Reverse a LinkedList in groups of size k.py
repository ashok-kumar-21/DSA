# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        def findkthNode(head, k):
            temp = head
            for i in range(k-1):
                if temp is not None:
                    temp = temp.next
            return temp
        def reverseLinkedList(head):
            temp = head
            prev1 = None
            while temp is not None:
                next = temp.next
                temp.next = prev1
                prev1 = temp
                temp = next 
        temp = head
        prevNode = None
        while temp != None:
            kthNode = findkthNode(temp, k)
            if kthNode is None:
                if prevNode:
                    prevNode.next = temp
                break;
            else:
                print(kthNode.val)
                nextNode = kthNode.next
                kthNode.next = None
            reverseLinkedList(temp)
            if temp == head:
                head = kthNode
            else:
                prevNode.next = kthNode
            prevNode = temp
            temp = nextNode
        return head
            
        
