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
    public ListNode removeElements(ListNode head, int val) {
            ListNode temp = new ListNode(0);
            ListNode result = temp;
            //when you revisit this reduce space complexity, in the loop

            while(head != null) {
                if (head.val != val) {
                    temp.next = new ListNode(head.val);
                    temp = temp.next;
                }
                head = head.next;
            }

            return result.next;
    }
}