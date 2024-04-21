import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        int counter = 0;
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        // int n = 1;
        int length = 0;

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