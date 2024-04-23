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

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode reverse = null;

        //reverse.
        while (head != null) {
            reverse = new ListNode(head.val, reverse);
            head = head.next;
        }

        //checker.
        while (fast != null && fast.next != null) {
            if (slow.val != reverse.val) return false;
            reverse = reverse.next;
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
