import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> n = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 | i == j)
                    n.add(1);
                else {
                    List<Integer> t = l.get(i-1);
                    n.add(t.get(j-1) + t.get(j));
                }
            }
            l.add(n);
        }



        return l;

    }
}