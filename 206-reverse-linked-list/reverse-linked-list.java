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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode next = head;
        ListNode prev = null;
        while(head.next != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        head.next = prev;

        return head;
    }
}