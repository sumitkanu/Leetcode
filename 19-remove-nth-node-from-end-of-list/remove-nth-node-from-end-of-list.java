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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode bye = head;
        ListNode prev = null;

        while(n > 1){
            temp = temp.next;
            n--;
        }

        while(temp.next != null) {
            prev = bye;
            bye = bye.next;
            temp = temp.next;
        }

        if(prev != null)
            prev.next = bye.next;
        else
            head = head.next;

        return head;
    }
}