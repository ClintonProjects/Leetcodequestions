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

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode result = new ListNode(0);
        ListNode r = result;

        for (ListNode n : lists) {
            if (n != null)
            pq.add(n);
        }

        while (!pq.isEmpty()) {
            result.next = pq.poll();
            result = result.next;

            if (result.next != null) 
            pq.add(result.next);
        }

        return r.next;
    }
}
