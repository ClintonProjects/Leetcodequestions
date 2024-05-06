/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null)
            return null;

        ListNode n = head;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while (n != null) {
            pq.add(n.val);
            n = n.next;
        }

        ListNode r = new ListNode(0);
        n = r;

        while (!pq.isEmpty()) {
            r.next = new ListNode(pq.poll());
            r = r.next;
        }

        return n.next;

    }
}