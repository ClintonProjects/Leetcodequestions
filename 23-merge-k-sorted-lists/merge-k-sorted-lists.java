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
        ArrayList<Integer> ls = new ArrayList<Integer>();
        
        for (ListNode n : lists) {
            while(n != null) {
            ls.add(n.val);
            n = n.next;
            }
        }

        Collections.sort(ls);

        ListNode result = new ListNode(0);
        ListNode r = result;

        for (int i : ls) {
            result.next = new ListNode(i); 
            result = result.next;
        }

        

        return r.next;

    }
}