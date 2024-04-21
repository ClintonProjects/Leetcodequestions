class Solution {
    public boolean isIsomorphic(String s, String t) {

        int map1[]=new int[200];
        int map2[]=new int[200];

        if(s.length()!=t.length())
            return false;


        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1[c] !=  map2[c2])
            return false;

            map1[c ] = i+1;
            map2[c2 ] = i+1;
        }
        
        return true;
    }



        



    }