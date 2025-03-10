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
        ListNode temp = head, headRev = new ListNode(head.val);
        ListNode temp2 = headRev;

        while(temp != null){
            temp2.next = new ListNode(temp.val);
            temp = temp.next;
            temp2 = temp2.next;
        }
        
        ListNode next = headRev;
        ListNode prev = null;
        while(headRev.next != null){
            next = headRev.next;
            headRev.next = prev;
            prev = headRev;
            headRev = next;
        }

        headRev.next = prev;

        int max = 0;

        while(head != null) {
            max = Math.max(max, head.val + headRev.val);
            head = head.next;
            headRev = headRev.next;
        }

        return max;
    }
}