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
        // ArrayList<Integer> ls = new ArrayList<Integer>();
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );
        
        for (ListNode n : lists) {
            while(n != null) {
            pq.offer(new ListNode(n.val));
            n = n.next;
            }
        }

        ListNode result = new ListNode(0);
        ListNode r = result;

        while(!pq.isEmpty()) {
            result.next = pq.poll(); 
            result = result.next;
        }

        return r.next;

    }
}