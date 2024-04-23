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
        // if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode l = null;
        ListNode h = head;

        //reverse.
        while (head != null) {
            l = new ListNode(head.val, l);
            head = head.next;
        }

        while (fast != null && fast.next != null) {
            if (slow.val != l.val) return false;
            l = l.next;
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
