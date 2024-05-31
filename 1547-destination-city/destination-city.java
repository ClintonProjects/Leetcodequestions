class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hs = new HashSet<String>();
        LinkedList<String> ls = new LinkedList<String>();
        for (int i = 0; i < paths.size(); i++) {
            hs.add(paths.get(i).get(0));
            ls.add(paths.get(i).get(1));
        }

        for (int i = 0; i < ls.size(); i++) {
            if (!hs.contains(ls.get(i)))
            return ls.get(i);
        }

        return null;


    }
}