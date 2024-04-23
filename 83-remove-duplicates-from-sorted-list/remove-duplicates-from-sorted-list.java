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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode r = new ListNode(-2392392);
        ListNode dummy = r;
        ListNode temp;

        while (head != null) {
            if (dummy.val != head.val) {
                temp  = new ListNode(head.val); 
                dummy.next = temp;
                dummy = dummy.next;
            }
  
            head = head.next;
        }

        return r.next;

        
    }
}