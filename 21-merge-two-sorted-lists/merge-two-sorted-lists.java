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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prev = null;
        ListNode curr = null;
        ListNode toadd = null;
        ListNode ans = null;

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val > list2.val) {
            toadd = list1;
            curr = list2;
            ans = list2;
        }
        else {
            curr = list1;
            toadd = list2;
            ans = list1;
        }

        while(curr != null && toadd != null){
            if(curr.val <= toadd.val){
                prev = curr;
                curr = curr.next;
            } else{
                prev.next = toadd;
                toadd = toadd.next;
                prev.next.next = curr;
                prev = prev.next;
            }
        }

        if(curr == null && toadd != null) {
            prev.next = toadd;
        }

        return ans;
    }
}