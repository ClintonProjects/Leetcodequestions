/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if ((headA == null && headB != null) && (headB == null && headA != null)) return null;

        ListNode n = headA;
        ListNode n2 = headB;

        Set<ListNode> hs = new HashSet<>();

        while (headA != null) {
            hs.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (hs.contains(headB)) return headB;
            headB = headB.next;
        }

        return null;
    }
}
