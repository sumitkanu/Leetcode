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
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode next = slow;
        ListNode prev = null;
        while(slow.next != null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        slow.next = prev;

        int max = 0;

        while(head.next != null) {
            max = Math.max(max, head.val + slow.val);
            head = head.next;
            slow = slow.next;
        }

        return max;
    }
}