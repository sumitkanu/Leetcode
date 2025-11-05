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
        ListNode curr = null;
        ListNode temp = null;
        ListNode next = head;

        while(next != null){
            temp = next;
            next = next.next;
            temp.next = curr;
            curr = temp;
        }
        return curr;
    }
}