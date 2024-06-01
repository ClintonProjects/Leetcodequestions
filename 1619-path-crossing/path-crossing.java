class Solution {

    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        String t = x + "," + y;
        HashSet<String> hs = new HashSet<String>();
        hs.add(t);

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') y++;
            else if (path.charAt(i) == 'S') y--; 
            else if (path.charAt(i) == 'E') x++; 
            else if (path.charAt(i) == 'W') x--;
            
            t = x + "," + y;
            if (!hs.add(t)) return true;
        }

        return false;
    }
}
