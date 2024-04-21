import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        int N = Math.max(nums1.length, nums2.length);
        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();
        List<List<Integer>> n = new ArrayList<List<Integer>>();
        
        // Initialize lists inside n
        n.add(new ArrayList<>());
        n.add(new ArrayList<>());

        for (int i = 0; i < N; i++) {
            if (i < nums1.length) {
                hs.add(nums1[i]);
            }
            if (i < nums2.length) {
                hs2.add(nums2[i]);
            }
        } 
        

        for (int i : nums1) {
            if (!hs2.contains(i) && !n.get(0).contains(i)) {
                n.get(0).add(i);
            }
        }

        for (int i : nums2) {
            if (!hs.contains(i) && !n.get(1).contains(i)) {
                n.get(1).add(i);
            }
        }

        return n;
    }
}
