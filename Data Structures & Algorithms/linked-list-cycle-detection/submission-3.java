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
    public boolean hasCycle(ListNode head) {
        // if (head == null || head.next == null || head.next.next == null) return false;
        
        // ListNode slow = head;
        // ListNode fast = head.next;

        // while (slow != fast && fast.next != null && fast.next.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }

        // if (slow == fast) {
        //     return true;
        //     // int index = 0;
        //     // slow = head;
        //     // while (slow != fast) {
        //     //     slow = slow.next;
        //     //     fast = fast.next;
        //     //     index++;
        //     // }
        //     // return index;
        // } 

        // return false;

        if (head == null || head.next == null || head.next == null) return false;

        ListNode slow = head, fast = head.next;

        while (fast != slow && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow == fast) return true;
        return false;
    }
}
