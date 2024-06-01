class Solution {

    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<Pair<Integer,Integer>> hs = new HashSet<>();
        hs.add(new Pair(0,0));

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') y++;
            else if (path.charAt(i) == 'S') y--; 
            else if (path.charAt(i) == 'E') x++; 
            else if (path.charAt(i) == 'W') x--;
            if (!hs.add(new Pair(x,y))) return true;
        }

        return false;
    }
}
