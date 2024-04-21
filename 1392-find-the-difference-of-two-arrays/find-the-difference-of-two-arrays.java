import java.util.*;

public class Solution {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<Integer>();
        Set<Integer> hs2 = new HashSet<Integer>();

        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();

        int N = Math.max(nums1.length, nums2.length);

        for (int i : nums1) hs.add(i);

        for (int i : nums2)  hs2.add(i);

        for (int i : hs) 
            if (!hs2.contains(i)) l1.add(i);
        

        for (int i : hs2) 
            if (!hs.contains(i)) l2.add(i);
        

        List<List<Integer>> n = new ArrayList<List<Integer>>();
        n.add(l1);
        n.add(l2);

        return n;
    }
}
