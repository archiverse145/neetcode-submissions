class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char comp = st.pop();

                if (s.charAt(i) == ')' && comp != '(') {
                    return false;
                }
                if (s.charAt(i) == ']' && comp != '[') {
                    return false;
                }
                if (s.charAt(i) == '}' && comp != '{') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
