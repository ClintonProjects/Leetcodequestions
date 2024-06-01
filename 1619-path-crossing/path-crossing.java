class Solution {

    public boolean isPathCrossing(String path) {
        //this question is revist a point not 0,0
        
        int x = 0;
        int y = 0;
        HashSet<String> hs = new HashSet<String>();
        hs.add("0,0");

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') y++;
            else if (path.charAt(i) == 'S') y--; 
            else if (path.charAt(i) == 'E') x++; 
            else if (path.charAt(i) == 'W') x--;
            String t = x + "," + y;
            if (!hs.add(t)) return true;
        }

        return false;
    }
}
