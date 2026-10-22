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
    public void reorderList(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode secondHead = slow.next;
        slow.next = null;

        ListNode prev = null, curr = secondHead, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode firstCurr = head;
        ListNode secondCurr = prev;

        while (firstCurr != null && secondCurr != null) {
            ListNode temp1 = firstCurr.next;
            ListNode temp2 = secondCurr.next;
            firstCurr.next = secondCurr;
            secondCurr.next = temp1;
            firstCurr = temp1;
            secondCurr = temp2; 
        }
    }
}
