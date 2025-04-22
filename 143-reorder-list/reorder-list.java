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
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        slow = null;
        fast = head2;

        while(head2 != null) {
            fast = head2.next;
            head2.next = slow;
            slow = head2;
            head2 = fast;
        }

        head2 = slow;
        slow = head;

        while(slow != null && head2 != null) {
            fast = slow.next;
            slow.next = head2;
            slow = fast;
            fast = head2.next;
            head2.next = slow;
            head2 = fast;
        }

    }
}