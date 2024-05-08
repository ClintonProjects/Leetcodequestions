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

    public int pairSum(ListNode head) {
        int n = 0; //is even and the size.
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode r = head;

        while (r != null) {
            map.put(n, r.val);
            r = r.next;
            n++;
        }

        n = n + 1;
        int result = -Integer.MAX_VALUE;
        int twin = 0;
        int counter = 0;

        while (head != null) {
            twin = n - 1 - counter - 1;
            System.out.println(twin);
            if (map.containsKey(twin)) {
                if ((0 <= counter) && (counter <= (n / 2) - 1)) {
                    result = Math.max(result, map.get(twin) + head.val);
                }
            }
            counter++;
            head = head.next;
        }

        return result;
    }
}
