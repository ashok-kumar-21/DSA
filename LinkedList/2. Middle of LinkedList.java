/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;
        while(fastptr != null && fastptr.next != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;
    }
}
/**
Approach: 
1. We take slow pointer and fast pointer and increase fast pointer by two times and slow pointer by one time. 
2. Once fast pointer reaches the end of the LL, slow pointer travels half the distance and reaches the middle 
of the linkedlist.
3. Atlast, we return slowpointer.
Time Complexity: O(n)
Space Complexity: O(1)
*/

