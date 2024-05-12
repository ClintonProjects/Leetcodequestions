import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

class Solution {

    public String kthLargestNumber(String[] nums, int k) {
        if (nums.length < k) return null;

        PriorityQueue<String> heap = new PriorityQueue<>(
            (a, b) -> {
                if (a.length() == b.length()) 
                return a.compareTo(b); 
                else 
                return Integer.compare(a.length(), b.length());
            }
        );

        for (String i : nums) {
            heap.offer(i);
            if (heap.size() > k)
            heap.poll();
        }
        
        return heap.poll();
    }
}
