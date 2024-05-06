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

        //System.out.println("pog");

        ListNode n = head;
        ArrayList<Integer> ls = new ArrayList<Integer>();

        while (n != null) {
            ls.add(n.val);
            n = n.next;
        }

        Collections.sort(ls);
        ListNode r = new ListNode(0);
        n = r;

        for (int i : ls) {
            r.next = new ListNode(i);
            r = r.next;
        }

        return n.next;

    }
}