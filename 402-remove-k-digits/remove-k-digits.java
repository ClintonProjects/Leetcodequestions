class Solution {

    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<Integer>();

        for (char c : num.toCharArray()) {
            int i = c - '0';

            while (!st.isEmpty() && k > 0 && st.peek() > i) {
                st.pop();
                k--;
            }

            if (!(st.isEmpty() && i == 0))
                st.push(i);
        }

        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;            
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(String.valueOf(st.pop()));
        }

        String r = sb.reverse().toString();

        if (r.isEmpty())
            r = "0";

        return r;
    }
}
