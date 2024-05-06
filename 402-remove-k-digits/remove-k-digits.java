class Solution {

    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int i;

        for (char c : num.toCharArray()) {
            i = c - '0';

            while (!st.isEmpty() && k > 0 && st.peek() - '0' > i) {
                st.pop();
                k--;
            }

            if (!(st.isEmpty() && i == 0)) st.push(c);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        if (st.isEmpty()) return "0";

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) 
            sb.append(st.pop());
        
        String r = sb.reverse().toString();

        return r;
    }
}
