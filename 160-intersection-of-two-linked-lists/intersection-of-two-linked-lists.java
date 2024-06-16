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
        Set<ListNode> hs2 = new HashSet<>();

        while (headA != null || headB != null) {
            if (headA != null) {
                hs.add(headA);
                if (hs2.contains(headA)) return headA;
                headA = headA.next;
            }

            if (headB != null) {
                hs2.add(headB);
                if (hs.contains(headB)) return headB;
                headB = headB.next;
            }
        }

        return null;
    }
}
