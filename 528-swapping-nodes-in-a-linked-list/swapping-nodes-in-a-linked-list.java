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

    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head, fast = head;
        int N = k-1;

        for (int i = 0; i < N; i++)
        fast = fast.next;

        ListNode first = fast;

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode second = slow;

        int t = first.val;
        first.val = second.val;
        second.val = t;
      
        return head;
    }
}
